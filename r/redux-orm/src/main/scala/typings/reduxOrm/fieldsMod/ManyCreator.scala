package typings.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManyCreator extends js.Object {
  
  def apply(opts: RelationalFieldOpts): ManyToMany = js.native
  def apply(toModelName: String): ManyToMany = js.native
  def apply(toModelName: String, relatedName: String): ManyToMany = js.native
}
