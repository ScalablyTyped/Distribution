package typings.sharepoint.global.SP

import typings.sharepoint.SP.FieldCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Taxonomy {
  
  @JSGlobal("SP.Taxonomy.ChangeInformation")
  @js.native
  class ChangeInformation protected ()
    extends typings.sharepoint.SP.Taxonomy.ChangeInformation {
    def this(context: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.ChangeItemType")
  @js.native
  object ChangeItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Taxonomy.ChangeItemType with Double] = js.native
    
    /* 3 */ val group: typings.sharepoint.SP.Taxonomy.ChangeItemType.group with Double = js.native
    
    /* 5 */ val site: typings.sharepoint.SP.Taxonomy.ChangeItemType.site with Double = js.native
    
    /* 1 */ val term: typings.sharepoint.SP.Taxonomy.ChangeItemType.term with Double = js.native
    
    /* 2 */ val termSet: typings.sharepoint.SP.Taxonomy.ChangeItemType.termSet with Double = js.native
    
    /* 4 */ val termStore: typings.sharepoint.SP.Taxonomy.ChangeItemType.termStore with Double = js.native
    
    /* 0 */ val unknown: typings.sharepoint.SP.Taxonomy.ChangeItemType.unknown with Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangeOperationType")
  @js.native
  object ChangeOperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Taxonomy.ChangeOperationType with Double] = js.native
    
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
  }
  
  @JSGlobal("SP.Taxonomy.ChangedGroup")
  @js.native
  class ChangedGroup ()
    extends typings.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedItem")
  @js.native
  class ChangedItem ()
    extends typings.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedSite")
  @js.native
  class ChangedSite ()
    extends typings.sharepoint.SP.Taxonomy.ChangedSite
  
  @JSGlobal("SP.Taxonomy.ChangedTerm")
  @js.native
  class ChangedTerm ()
    extends typings.sharepoint.SP.Taxonomy.ChangedTerm
  
  @JSGlobal("SP.Taxonomy.ChangedTermSet")
  @js.native
  class ChangedTermSet ()
    extends typings.sharepoint.SP.Taxonomy.ChangedTermSet
  
  @JSGlobal("SP.Taxonomy.ChangedTermStore")
  @js.native
  class ChangedTermStore ()
    extends typings.sharepoint.SP.Taxonomy.ChangedTermStore
  
  @JSGlobal("SP.Taxonomy.CustomPropertyMatchInformation")
  @js.native
  class CustomPropertyMatchInformation protected ()
    extends typings.sharepoint.SP.Taxonomy.CustomPropertyMatchInformation {
    def this(context: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.Label")
  @js.native
  class Label ()
    extends typings.sharepoint.SP.Taxonomy.Label
  
  @JSGlobal("SP.Taxonomy.LabelMatchInformation")
  @js.native
  class LabelMatchInformation protected ()
    extends typings.sharepoint.SP.Taxonomy.LabelMatchInformation {
    def this(context: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.MobileTaxonomyField")
  @js.native
  class MobileTaxonomyField ()
    extends typings.sharepoint.SP.Taxonomy.MobileTaxonomyField
  
  @JSGlobal("SP.Taxonomy.StringMatchOption")
  @js.native
  object StringMatchOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Taxonomy.StringMatchOption with Double] = js.native
    
    /* 1 */ val exactMatch: typings.sharepoint.SP.Taxonomy.StringMatchOption.exactMatch with Double = js.native
    
    /* 0 */ val startsWith: typings.sharepoint.SP.Taxonomy.StringMatchOption.startsWith with Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyField")
  @js.native
  class TaxonomyField protected ()
    extends typings.sharepoint.SP.Taxonomy.TaxonomyField {
    def this(context: typings.sharepoint.SP.ClientContext, fields: FieldCollection, filedName: String) = this()
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValue")
  @js.native
  class TaxonomyFieldValue ()
    extends typings.sharepoint.SP.Taxonomy.TaxonomyFieldValue
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
  @js.native
  class TaxonomyFieldValueCollection protected ()
    extends typings.sharepoint.SP.Taxonomy.TaxonomyFieldValueCollection {
    def this(
      context: typings.sharepoint.SP.ClientContext,
      fieldValue: String,
      creatingField: typings.sharepoint.SP.Field
    ) = this()
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyItem")
  @js.native
  class TaxonomyItem ()
    extends typings.sharepoint.SP.Taxonomy.TaxonomyItem
  object TaxonomyItem {
    
    /* static member */
    @JSGlobal("SP.Taxonomy.TaxonomyItem.normalizeName")
    @js.native
    def normalizeName(context: typings.sharepoint.SP.ClientContext, name: String): typings.sharepoint.SP.StringResult = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomySession")
  @js.native
  class TaxonomySession ()
    extends typings.sharepoint.SP.Taxonomy.TaxonomySession
  object TaxonomySession {
    
    /* static member */
    @JSGlobal("SP.Taxonomy.TaxonomySession.getTaxonomySession")
    @js.native
    def getTaxonomySession(context: typings.sharepoint.SP.ClientContext): typings.sharepoint.SP.Taxonomy.TaxonomySession = js.native
  }
  
  @JSGlobal("SP.Taxonomy.Term")
  @js.native
  class Term ()
    extends typings.sharepoint.SP.Taxonomy.Term
  
  @JSGlobal("SP.Taxonomy.TermGroup")
  @js.native
  class TermGroup ()
    extends typings.sharepoint.SP.Taxonomy.TermGroup
  
  @JSGlobal("SP.Taxonomy.TermSet")
  @js.native
  class TermSet ()
    extends typings.sharepoint.SP.Taxonomy.TermSet
  
  @JSGlobal("SP.Taxonomy.TermSetItem")
  @js.native
  class TermSetItem ()
    extends typings.sharepoint.SP.Taxonomy.TermSetItem
  
  @JSGlobal("SP.Taxonomy.TermStore")
  @js.native
  class TermStore ()
    extends typings.sharepoint.SP.Taxonomy.TermStore
}
