package typings
package reduxLib.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnyAction
  extends Action[js.Any]
     with // Allows any extra properties to be defined in an action.
/* extraProps */ ScalablyTyped.runtime.StringDictionary[js.Any]

