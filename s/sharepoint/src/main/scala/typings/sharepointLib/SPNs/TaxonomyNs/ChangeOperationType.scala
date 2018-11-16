package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeOperationType extends js.Object

@JSGlobal("SP.Taxonomy.ChangeOperationType")
@js.native
object ChangeOperationType extends js.Object {
  @js.native
  sealed trait add
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait copy
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait deleteObject
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait edit
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait importObject
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait merge
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait move
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait pathChange
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait restore
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  @js.native
  sealed trait unknown
    extends sharepointLib.SPNs.TaxonomyNs.ChangeOperationType
  
  val add: add with java.lang.String = js.native
  val copy: copy with java.lang.String = js.native
  val deleteObject: deleteObject with java.lang.String = js.native
  val edit: edit with java.lang.String = js.native
  val importObject: importObject with java.lang.String = js.native
  val merge: merge with java.lang.String = js.native
  val move: move with java.lang.String = js.native
  val pathChange: pathChange with java.lang.String = js.native
  val restore: restore with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.TaxonomyNs.ChangeOperationType with java.lang.String] = js.native
}

