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
  
  /* 1 */ val add: add with scala.Double = js.native
  /* 5 */ val copy: copy with scala.Double = js.native
  /* 3 */ val deleteObject: deleteObject with scala.Double = js.native
  /* 2 */ val edit: edit with scala.Double = js.native
  /* 8 */ val importObject: importObject with scala.Double = js.native
  /* 7 */ val merge: merge with scala.Double = js.native
  /* 4 */ val move: move with scala.Double = js.native
  /* 6 */ val pathChange: pathChange with scala.Double = js.native
  /* 9 */ val restore: restore with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.TaxonomyNs.ChangeOperationType with scala.Double] = js.native
}

