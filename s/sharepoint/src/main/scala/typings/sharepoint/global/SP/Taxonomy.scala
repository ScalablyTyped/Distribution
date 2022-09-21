package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import typings.sharepoint.SP.FieldCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Taxonomy {
  
  @JSGlobal("SP.Taxonomy.ChangeInformation")
  @js.native
  open class ChangeInformation protected ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangeInformation {
    def this(context: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.ChangeItemType")
  @js.native
  object ChangeItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Taxonomy.ChangeItemType & Double] = js.native
    
    /* 3 */ val group: typings.sharepoint.SP.Taxonomy.ChangeItemType.group & Double = js.native
    
    /* 5 */ val site: typings.sharepoint.SP.Taxonomy.ChangeItemType.site & Double = js.native
    
    /* 1 */ val term: typings.sharepoint.SP.Taxonomy.ChangeItemType.term & Double = js.native
    
    /* 2 */ val termSet: typings.sharepoint.SP.Taxonomy.ChangeItemType.termSet & Double = js.native
    
    /* 4 */ val termStore: typings.sharepoint.SP.Taxonomy.ChangeItemType.termStore & Double = js.native
    
    /* 0 */ val unknown: typings.sharepoint.SP.Taxonomy.ChangeItemType.unknown & Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangeOperationType")
  @js.native
  object ChangeOperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Taxonomy.ChangeOperationType & Double] = js.native
    
    /* 1 */ val add: typings.sharepoint.SP.Taxonomy.ChangeOperationType.add & Double = js.native
    
    /* 5 */ val copy: typings.sharepoint.SP.Taxonomy.ChangeOperationType.copy & Double = js.native
    
    /* 3 */ val deleteObject: typings.sharepoint.SP.Taxonomy.ChangeOperationType.deleteObject & Double = js.native
    
    /* 2 */ val edit: typings.sharepoint.SP.Taxonomy.ChangeOperationType.edit & Double = js.native
    
    /* 8 */ val importObject: typings.sharepoint.SP.Taxonomy.ChangeOperationType.importObject & Double = js.native
    
    /* 7 */ val merge: typings.sharepoint.SP.Taxonomy.ChangeOperationType.merge & Double = js.native
    
    /* 4 */ val move: typings.sharepoint.SP.Taxonomy.ChangeOperationType.move & Double = js.native
    
    /* 6 */ val pathChange: typings.sharepoint.SP.Taxonomy.ChangeOperationType.pathChange & Double = js.native
    
    /* 9 */ val restore: typings.sharepoint.SP.Taxonomy.ChangeOperationType.restore & Double = js.native
    
    /* 0 */ val unknown: typings.sharepoint.SP.Taxonomy.ChangeOperationType.unknown & Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangedGroup")
  @js.native
  open class ChangedGroup ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedItem")
  @js.native
  open class ChangedItem ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedSite")
  @js.native
  open class ChangedSite ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangedSite
  
  @JSGlobal("SP.Taxonomy.ChangedTerm")
  @js.native
  open class ChangedTerm ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangedTerm
  
  @JSGlobal("SP.Taxonomy.ChangedTermSet")
  @js.native
  open class ChangedTermSet ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangedTermSet
  
  @JSGlobal("SP.Taxonomy.ChangedTermStore")
  @js.native
  open class ChangedTermStore ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.ChangedTermStore
  
  @JSGlobal("SP.Taxonomy.CustomPropertyMatchInformation")
  @js.native
  open class CustomPropertyMatchInformation protected ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.CustomPropertyMatchInformation {
    def this(context: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.Label")
  @js.native
  open class Label ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.Label
  
  @JSGlobal("SP.Taxonomy.LabelMatchInformation")
  @js.native
  open class LabelMatchInformation protected ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.LabelMatchInformation {
    def this(context: typings.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.MobileTaxonomyField")
  @js.native
  open class MobileTaxonomyField ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.MobileTaxonomyField
  
  @JSGlobal("SP.Taxonomy.StringMatchOption")
  @js.native
  object StringMatchOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.Taxonomy.StringMatchOption & Double] = js.native
    
    /* 1 */ val exactMatch: typings.sharepoint.SP.Taxonomy.StringMatchOption.exactMatch & Double = js.native
    
    /* 0 */ val startsWith: typings.sharepoint.SP.Taxonomy.StringMatchOption.startsWith & Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyField")
  @js.native
  open class TaxonomyField protected ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TaxonomyField {
    def this(context: typings.sharepoint.SP.ClientContext, fields: FieldCollection, filedName: String) = this()
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValue")
  @js.native
  open class TaxonomyFieldValue ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TaxonomyFieldValue {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_label(): String = js.native
    
    /* CompleteClass */
    override def get_termGuid(): typings.sharepoint.SP.Guid = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_wssId(): Double = js.native
    
    /* CompleteClass */
    override def set_label(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_termGuid(value: typings.sharepoint.SP.Guid): Unit = js.native
    
    /* CompleteClass */
    override def set_wssId(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typings.sharepoint.SP.XmlWriter,
      serializationContext: typings.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
  @js.native
  open class TaxonomyFieldValueCollection protected ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TaxonomyFieldValueCollection {
    def this(
      context: typings.sharepoint.SP.ClientContext,
      fieldValue: String,
      creatingField: typings.sharepoint.SP.Field
    ) = this()
    
    /* CompleteClass */
    override def getEnumerator(): IEnumerator[typings.sharepoint.SP.Taxonomy.TaxonomyFieldValue] = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyItem")
  @js.native
  open class TaxonomyItem ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TaxonomyItem
  object TaxonomyItem {
    
    @JSGlobal("SP.Taxonomy.TaxonomyItem")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def normalizeName(context: typings.sharepoint.SP.ClientContext, name: String): typings.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeName")(context.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.sharepoint.SP.StringResult]
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomySession")
  @js.native
  open class TaxonomySession ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TaxonomySession
  object TaxonomySession {
    
    @JSGlobal("SP.Taxonomy.TaxonomySession")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getTaxonomySession(context: typings.sharepoint.SP.ClientContext): typings.sharepoint.SP.Taxonomy.TaxonomySession = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaxonomySession")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.Taxonomy.TaxonomySession]
  }
  
  @JSGlobal("SP.Taxonomy.Term")
  @js.native
  open class Term ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.Term
  
  @JSGlobal("SP.Taxonomy.TermGroup")
  @js.native
  open class TermGroup ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TermGroup
  
  @JSGlobal("SP.Taxonomy.TermSet")
  @js.native
  open class TermSet ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TermSet
  
  @JSGlobal("SP.Taxonomy.TermSetItem")
  @js.native
  open class TermSetItem ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TermSetItem
  
  @JSGlobal("SP.Taxonomy.TermStore")
  @js.native
  open class TermStore ()
    extends StObject
       with typings.sharepoint.SP.Taxonomy.TermStore
}
