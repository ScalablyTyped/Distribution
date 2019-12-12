package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.add
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.copy
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.deleteObject
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.edit
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.importObject
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.merge
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.move
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.pathChange
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.restore
import typings.sharepoint.SP.Taxonomy.ChangeOperationType.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeOperationType with Double] = js.native
  /* 1 */ @js.native
  object add extends TopLevel[add with Double]
  
  /* 5 */ @js.native
  object copy extends TopLevel[copy with Double]
  
  /* 3 */ @js.native
  object deleteObject extends TopLevel[deleteObject with Double]
  
  /* 2 */ @js.native
  object edit extends TopLevel[edit with Double]
  
  /* 8 */ @js.native
  object importObject extends TopLevel[importObject with Double]
  
  /* 7 */ @js.native
  object merge extends TopLevel[merge with Double]
  
  /* 4 */ @js.native
  object move extends TopLevel[move with Double]
  
  /* 6 */ @js.native
  object pathChange extends TopLevel[pathChange with Double]
  
  /* 9 */ @js.native
  object restore extends TopLevel[restore with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

