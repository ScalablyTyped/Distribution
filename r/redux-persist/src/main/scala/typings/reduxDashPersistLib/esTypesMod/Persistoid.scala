package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Persistoid extends js.Object {
  def flush(): stdLib.Promise[_]
  def update(item: js.Any): scala.Unit
}

