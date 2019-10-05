package typings.sharepoint.SP.Taxonomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeOperationType extends js.Object

@JSGlobal("SP.Taxonomy.ChangeOperationType")
@js.native
object ChangeOperationType extends js.Object {
  @js.native
  sealed trait add extends ChangeOperationType
  
  @js.native
  sealed trait copy extends ChangeOperationType
  
  @js.native
  sealed trait deleteObject extends ChangeOperationType
  
  @js.native
  sealed trait edit extends ChangeOperationType
  
  @js.native
  sealed trait importObject extends ChangeOperationType
  
  @js.native
  sealed trait merge extends ChangeOperationType
  
  @js.native
  sealed trait move extends ChangeOperationType
  
  @js.native
  sealed trait pathChange extends ChangeOperationType
  
  @js.native
  sealed trait restore extends ChangeOperationType
  
  @js.native
  sealed trait unknown extends ChangeOperationType
  
  /* 1 */ val add: typings.sharepoint.SP.Taxonomy.ChangeOperationType.add with Double = js.native
  /* 5 */ val copy: typings.sharepoint.SP.Taxonomy.ChangeOperationType.copy with Double = js.native
  /* 3 */ val deleteObject: typings.sharepoint.SP.Taxonomy.ChangeOperationType.deleteObject with Double = js.native
  /* 2 */ val edit: typings.sharepoint.SP.Taxonomy.ChangeOperationType.edit with Double = js.native
  /* 8 */ val importObject: typings.sharepoint.SP.Taxonomy.ChangeOperationType.importObject with Double = js.native
  /* 7 */ val merge: typings.sharepoint.SP.Taxonomy.ChangeOperationType.merge with Double = js.native
  /* 4 */ val move: typings.sharepoint.SP.Taxonomy.ChangeOperationType.move with Double = js.native
  /* 6 */ val pathChange: typings.sharepoint.SP.Taxonomy.ChangeOperationType.pathChange with Double = js.native
  /* 9 */ val restore: typings.sharepoint.SP.Taxonomy.ChangeOperationType.restore with Double = js.native
  /* 0 */ val unknown: typings.sharepoint.SP.Taxonomy.ChangeOperationType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeOperationType with Double] = js.native
}

