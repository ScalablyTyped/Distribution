package typings.sharepoint.global.Microsoft.SharePoint.Client.Search

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.IEnumerator
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection
import typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Query {
  
  /**Contains information about a keyword based search query.*/
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQuery")
  @js.native
  open class KeywordQuery protected ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.KeywordQuery {
    def this(context: ClientContext) = this()
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames")
  @js.native
  open class KeywordQueryObjectPropertyNames ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames
  object KeywordQueryObjectPropertyNames {
    
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames.properties")
    @js.native
    def properties: String = js.native
    inline def properties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
    
    // 'Properties';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames.refinementFilters")
    @js.native
    def refinementFilters: String = js.native
    inline def refinementFilters_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refinementFilters")(x.asInstanceOf[js.Any])
    
    // 'RefinementFilters';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames.reorderingRules")
    @js.native
    def reorderingRules: String = js.native
    inline def reorderingRules_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reorderingRules")(x.asInstanceOf[js.Any])
    
    // 'ReorderingRules';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames.selectProperties")
    @js.native
    def selectProperties: String = js.native
    inline def selectProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectProperties")(x.asInstanceOf[js.Any])
    
    // 'SelectProperties';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryObjectPropertyNames.sortList")
    @js.native
    def sortList: String = js.native
    inline def sortList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortList")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryProperties")
  @js.native
  open class KeywordQueryProperties ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.KeywordQueryProperties
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames")
  @js.native
  open class KeywordQueryPropertyNames ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames
  object KeywordQueryPropertyNames {
    
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames.collapseSpecification")
    @js.native
    def collapseSpecification: String = js.native
    inline def collapseSpecification_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collapseSpecification")(x.asInstanceOf[js.Any])
    
    // 'CollapseSpecification';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames.enableSorting")
    @js.native
    def enableSorting: String = js.native
    inline def enableSorting_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableSorting")(x.asInstanceOf[js.Any])
    
    // 'EnableSorting';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames.hiddenConstraints")
    @js.native
    def hiddenConstraints: String = js.native
    inline def hiddenConstraints_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenConstraints")(x.asInstanceOf[js.Any])
    
    // 'HiddenConstraints';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames.refiners")
    @js.native
    def refiners: String = js.native
    inline def refiners_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refiners")(x.asInstanceOf[js.Any])
    
    // 'Refiners';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.KeywordQueryPropertyNames.trimDuplicatesIncludeId")
    @js.native
    def trimDuplicatesIncludeId: String = js.native
    inline def trimDuplicatesIncludeId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimDuplicatesIncludeId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.PersonalResultSuggestion")
  @js.native
  open class PersonalResultSuggestion ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.PersonalResultSuggestion {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_highlightedTitle(): String = js.native
    
    /* CompleteClass */
    override def get_isBestBet(): Boolean = js.native
    
    /* CompleteClass */
    override def get_title(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_url(): String = js.native
    
    /* CompleteClass */
    override def set_highlightedTitle(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_isBestBet(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def set_title(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_url(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.PopularQuery")
  @js.native
  open class PopularQuery ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.PopularQuery {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_LCID(): Double = js.native
    
    /* CompleteClass */
    override def get_clickCount(): Double = js.native
    
    /* CompleteClass */
    override def get_queryCount(): Double = js.native
    
    /* CompleteClass */
    override def get_queryText(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_LCID(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_clickCount(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_queryCount(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_queryText(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  /**Contains information common to all types of search queries.*/
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.Query")
  @js.native
  open class Query ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.Query
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryObjectPropertyNames")
  @js.native
  open class QueryObjectPropertyNames ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryObjectPropertyNames
  object QueryObjectPropertyNames {
    
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryObjectPropertyNames")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryObjectPropertyNames.hitHighlightedProperties")
    @js.native
    def hitHighlightedProperties: String = js.native
    inline def hitHighlightedProperties_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitHighlightedProperties")(x.asInstanceOf[js.Any])
    
    // = 'HitHighlightedProperties';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryObjectPropertyNames.personalizationData")
    @js.native
    def personalizationData: String = js.native
    inline def personalizationData_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("personalizationData")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPersonalizationData")
  @js.native
  open class QueryPersonalizationData ()
    extends StObject
       with ClientObject
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames")
  @js.native
  open class QueryPropertyNames ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames
  object QueryPropertyNames {
    
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.blockDedupeMode")
    @js.native
    def blockDedupeMode: String = js.native
    inline def blockDedupeMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockDedupeMode")(x.asInstanceOf[js.Any])
    
    // 'BlockDedupeMode';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.bypassResultTypes")
    @js.native
    def bypassResultTypes: String = js.native
    inline def bypassResultTypes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassResultTypes")(x.asInstanceOf[js.Any])
    
    // 'BypassResultTypes';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.clientType")
    @js.native
    def clientType: String = js.native
    inline def clientType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientType")(x.asInstanceOf[js.Any])
    
    // 'ClientType';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.culture")
    @js.native
    def culture: String = js.native
    inline def culture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("culture")(x.asInstanceOf[js.Any])
    
    // 'Culture';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.desiredSnippetLength")
    @js.native
    def desiredSnippetLength: String = js.native
    inline def desiredSnippetLength_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desiredSnippetLength")(x.asInstanceOf[js.Any])
    
    // 'DesiredSnippetLength';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.enableInterleaving")
    @js.native
    def enableInterleaving: String = js.native
    inline def enableInterleaving_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableInterleaving")(x.asInstanceOf[js.Any])
    
    // 'EnableInterleaving';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.enableNicknames")
    @js.native
    def enableNicknames: String = js.native
    inline def enableNicknames_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableNicknames")(x.asInstanceOf[js.Any])
    
    // 'EnableNicknames';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.enableOrderingHitHighlightedProperty")
    @js.native
    def enableOrderingHitHighlightedProperty: String = js.native
    inline def enableOrderingHitHighlightedProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableOrderingHitHighlightedProperty")(x.asInstanceOf[js.Any])
    
    // 'EnableOrderingHitHighlightedProperty';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.enablePhonetic")
    @js.native
    def enablePhonetic: String = js.native
    inline def enablePhonetic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enablePhonetic")(x.asInstanceOf[js.Any])
    
    // 'EnablePhonetic';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.enableQueryRules")
    @js.native
    def enableQueryRules: String = js.native
    inline def enableQueryRules_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableQueryRules")(x.asInstanceOf[js.Any])
    
    // 'EnableQueryRules';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.enableStemming")
    @js.native
    def enableStemming: String = js.native
    inline def enableStemming_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableStemming")(x.asInstanceOf[js.Any])
    
    // 'EnableStemming';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.generateBlockRankLog")
    @js.native
    def generateBlockRankLog: String = js.native
    inline def generateBlockRankLog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generateBlockRankLog")(x.asInstanceOf[js.Any])
    
    // 'GenerateBlockRankLog';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.hitHighlightedMultivaluePropertyLimit")
    @js.native
    def hitHighlightedMultivaluePropertyLimit: String = js.native
    inline def hitHighlightedMultivaluePropertyLimit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitHighlightedMultivaluePropertyLimit")(x.asInstanceOf[js.Any])
    
    // 'HitHighlightedMultivaluePropertyLimit';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.ignoreSafeQueryPropertiesTemplateUrl")
    @js.native
    def ignoreSafeQueryPropertiesTemplateUrl: String = js.native
    inline def ignoreSafeQueryPropertiesTemplateUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreSafeQueryPropertiesTemplateUrl")(x.asInstanceOf[js.Any])
    
    // 'IgnoreSafeQueryPropertiesTemplateUrl';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.impressionID")
    @js.native
    def impressionID: String = js.native
    inline def impressionID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("impressionID")(x.asInstanceOf[js.Any])
    
    // 'ImpressionID';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.maxSnippetLength")
    @js.native
    def maxSnippetLength: String = js.native
    inline def maxSnippetLength_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxSnippetLength")(x.asInstanceOf[js.Any])
    
    // 'MaxSnippetLength';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.processBestBets")
    @js.native
    def processBestBets: String = js.native
    inline def processBestBets_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processBestBets")(x.asInstanceOf[js.Any])
    
    // 'ProcessBestBets';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.processPersonalFavorites")
    @js.native
    def processPersonalFavorites: String = js.native
    inline def processPersonalFavorites_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processPersonalFavorites")(x.asInstanceOf[js.Any])
    
    // 'ProcessPersonalFavorites';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.queryTag")
    @js.native
    def queryTag: String = js.native
    inline def queryTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryTag")(x.asInstanceOf[js.Any])
    
    // 'QueryTag';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.queryTemplate")
    @js.native
    def queryTemplate: String = js.native
    
    // 'QueryTemplate';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.queryTemplateParameters")
    @js.native
    def queryTemplateParameters: String = js.native
    inline def queryTemplateParameters_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryTemplateParameters")(x.asInstanceOf[js.Any])
    
    inline def queryTemplate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryTemplate")(x.asInstanceOf[js.Any])
    
    // 'QueryTemplateParameters';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.queryText")
    @js.native
    def queryText: String = js.native
    inline def queryText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryText")(x.asInstanceOf[js.Any])
    
    // 'QueryText';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.rankingModelId")
    @js.native
    def rankingModelId: String = js.native
    inline def rankingModelId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rankingModelId")(x.asInstanceOf[js.Any])
    
    // 'RankingModelId';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.resultsUrl")
    @js.native
    def resultsUrl: String = js.native
    inline def resultsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resultsUrl")(x.asInstanceOf[js.Any])
    
    // 'ResultsUrl';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.rowLimit")
    @js.native
    def rowLimit: String = js.native
    inline def rowLimit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowLimit")(x.asInstanceOf[js.Any])
    
    // 'RowLimit';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.rowsPerPage")
    @js.native
    def rowsPerPage: String = js.native
    inline def rowsPerPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowsPerPage")(x.asInstanceOf[js.Any])
    
    // 'RowsPerPage';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.safeQueryPropertiesTemplateUrl")
    @js.native
    def safeQueryPropertiesTemplateUrl: String = js.native
    inline def safeQueryPropertiesTemplateUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safeQueryPropertiesTemplateUrl")(x.asInstanceOf[js.Any])
    
    // 'SafeQueryPropertiesTemplateUrl';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.showPeopleNameSuggestions")
    @js.native
    def showPeopleNameSuggestions: String = js.native
    inline def showPeopleNameSuggestions_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showPeopleNameSuggestions")(x.asInstanceOf[js.Any])
    
    // 'ShowPeopleNameSuggestions';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.sourceId")
    @js.native
    def sourceId: String = js.native
    inline def sourceId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(x.asInstanceOf[js.Any])
    
    // 'SourceId';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.startRow")
    @js.native
    def startRow: String = js.native
    inline def startRow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startRow")(x.asInstanceOf[js.Any])
    
    // 'StartRow';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.summaryLength")
    @js.native
    def summaryLength: String = js.native
    inline def summaryLength_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryLength")(x.asInstanceOf[js.Any])
    
    // 'SummaryLength';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.timeout")
    @js.native
    def timeout: String = js.native
    inline def timeout_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    // 'Timeout';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.totalRowsExactMinimum")
    @js.native
    def totalRowsExactMinimum: String = js.native
    inline def totalRowsExactMinimum_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalRowsExactMinimum")(x.asInstanceOf[js.Any])
    
    // 'TotalRowsExactMinimum';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.trimDuplicates")
    @js.native
    def trimDuplicates: String = js.native
    inline def trimDuplicates_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimDuplicates")(x.asInstanceOf[js.Any])
    
    // 'TrimDuplicates';
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyNames.uiLanguage")
    @js.native
    def uiLanguage: String = js.native
    inline def uiLanguage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uiLanguage")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue")
  @js.native
  open class QueryPropertyValue ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_boolVal(): Boolean = js.native
    
    /* CompleteClass */
    override def get_intVal(): Double = js.native
    
    /* CompleteClass */
    override def get_queryPropertyValueTypeIndex(): Double = js.native
    
    /* CompleteClass */
    override def get_strArray(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def get_strVal(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_boolVal(value: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def set_intVal(value: Double): Double = js.native
    
    /* CompleteClass */
    override def set_queryPropertyValueTypeIndex(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_strArray(value: js.Array[String]): js.Array[String] = js.native
    
    /* CompleteClass */
    override def set_strVal(value: String): String = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType")
  @js.native
  object QueryPropertyValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType & Double
      ] = js.native
    
    /* 3 */ val booleanType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.booleanType & Double = js.native
    
    /* 2 */ val int32TYpe: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.int32TYpe & Double = js.native
    
    /* 0 */ val none: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.none & Double = js.native
    
    /* 4 */ val stringArrayType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.stringArrayType & Double = js.native
    
    /* 1 */ val stringType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.stringType & Double = js.native
    
    /* 5 */ val unSupportedType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.unSupportedType & Double = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QuerySuggestionQuery")
  @js.native
  open class QuerySuggestionQuery ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionQuery {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_isPersonal(): Boolean = js.native
    
    /* CompleteClass */
    override def get_query(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_isPersonal(value: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def set_query(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QuerySuggestionResults")
  @js.native
  open class QuerySuggestionResults ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionResults {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_peopleNames(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def get_personalResults(): js.Array[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.PersonalResultSuggestion
      ] = js.native
    
    /* CompleteClass */
    override def get_queries(): js.Array[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionQuery] = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_peopleNames(value: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def set_personalResults(
      value: js.Array[
          typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.PersonalResultSuggestion
        ]
    ): Unit = js.native
    
    /* CompleteClass */
    override def set_queries(value: js.Array[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QuerySuggestionQuery]): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryUtility")
  @js.native
  open class QueryUtility ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryUtility
  object QueryUtility {
    
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryUtility")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryUtility.create")
    @js.native
    def create: js.Function2[
        /* name */ String, 
        /* val */ Any, 
        typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue
      ] = js.native
    inline def create_=(
      x: js.Function2[
          /* name */ String, 
          /* val */ Any, 
          typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryUtility.getQueryPropertyValueType")
    @js.native
    def getQueryPropertyValueType: js.Function1[
        /* val */ typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue, 
        QueryPropertyValueType
      ] = js.native
    inline def getQueryPropertyValueType_=(
      x: js.Function1[
          /* val */ typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue, 
          QueryPropertyValueType
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getQueryPropertyValueType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryUtility.queryPropertyValueToObject")
    @js.native
    def queryPropertyValueToObject: js.Function1[
        /* val */ typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue, 
        Any
      ] = js.native
    inline def queryPropertyValueToObject_=(
      x: js.Function1[
          /* val */ typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValue, 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryPropertyValueToObject")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.RankingLabeling")
  @js.native
  open class RankingLabeling protected ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.RankingLabeling {
    def this(context: ClientContext) = this()
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.ReorderingRule")
  @js.native
  open class ReorderingRule ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRule {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_boost(): Double = js.native
    
    /* CompleteClass */
    override def get_matchType(): ReorderingRuleMatchType = js.native
    
    /* CompleteClass */
    override def get_matchValue(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_boost(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_matchType(value: ReorderingRuleMatchType): Unit = js.native
    
    /* CompleteClass */
    override def set_matchValue(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType")
  @js.native
  object ReorderingRuleMatchType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType & Double
      ] = js.native
    
    /* 5 */ val contentTypeIs: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.contentTypeIs & Double = js.native
    
    /* 6 */ val fileExtensionMatches: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.fileExtensionMatches & Double = js.native
    
    /* 8 */ val manualCondition: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.manualCondition & Double = js.native
    
    /* 0 */ val resultContainsKeyword: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.resultContainsKeyword & Double = js.native
    
    /* 7 */ val resultHasTag: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.resultHasTag & Double = js.native
    
    /* 1 */ val titleContainsKeyword: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.titleContainsKeyword & Double = js.native
    
    /* 2 */ val titleMatchesKeyword: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.titleMatchesKeyword & Double = js.native
    
    /* 4 */ val urlExactlyMatches: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.urlExactlyMatches & Double = js.native
    
    /* 3 */ val urlStartsWith: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ReorderingRuleMatchType.urlStartsWith & Double = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTable")
  @js.native
  open class ResultTable ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_groupTemplateId(): String = js.native
    
    /* CompleteClass */
    override def get_itemTemplateId(): String = js.native
    
    /* CompleteClass */
    override def get_properties(): StringDictionary[Any] = js.native
    
    /* CompleteClass */
    override def get_queryId(): String = js.native
    
    /* CompleteClass */
    override def get_queryRuleId(): String = js.native
    
    /* CompleteClass */
    override def get_resultRows(): js.Array[StringDictionary[Any]] = js.native
    
    /* CompleteClass */
    override def get_resultTitle(): String = js.native
    
    /* CompleteClass */
    override def get_resultTitleUrl(): String = js.native
    
    /* CompleteClass */
    override def get_rowCount(): Double = js.native
    
    /* CompleteClass */
    override def get_tableType(): String = js.native
    
    /* CompleteClass */
    override def get_totalRows(): Double = js.native
    
    /* CompleteClass */
    override def get_totalRowsIncludingDuplicates(): Double = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def initPropertiesFromJson(parentNode: Any): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.ResultTableCollection")
  @js.native
  open class ResultTableCollection ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTableCollection {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def getEnumerator(): IEnumerator[typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable] = js.native
    
    /* CompleteClass */
    override def get_count(): Double = js.native
    
    /* CompleteClass */
    override def get_elapsedTime(): Double = js.native
    
    /* CompleteClass */
    override def get_item(index: Double): typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.ResultTable = js.native
    
    /* CompleteClass */
    override def get_properties(): StringDictionary[Any] = js.native
    
    /* CompleteClass */
    override def get_queryErrors(): StringDictionary[ControlMessage] = js.native
    
    /* CompleteClass */
    override def get_queryId(): String = js.native
    
    /* CompleteClass */
    override def get_spellingSuggestion(): String = js.native
    
    /* CompleteClass */
    override def get_triggeredRules(): js.Array[Guid] = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def initPropertiesFromJson(parentNode: Any): Unit = js.native
    
    /* CompleteClass */
    override def set_elapsedTime(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  /**Executes queries against a search server.*/
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.SearchExecutor")
  @js.native
  open class SearchExecutor protected ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SearchExecutor {
    def this(context: ClientContext) = this()
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.Sort")
  @js.native
  open class Sort ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.Sort {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_direction(): SortDirection = js.native
    
    /* CompleteClass */
    override def get_property(): String = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_direction(value: SortDirection): Unit = js.native
    
    /* CompleteClass */
    override def set_property(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.SortDirection")
  @js.native
  object SortDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection & Double
      ] = js.native
    
    /* 0 */ val ascending: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.ascending & Double = js.native
    
    /* 1 */ val descending: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.descending & Double = js.native
    
    /* 2 */ val fqlFormula: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.SortDirection.fqlFormula & Double = js.native
  }
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.Query.StringCollection")
  @js.native
  open class StringCollection protected ()
    extends StObject
       with typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.StringCollection {
    def this(context: ClientContext) = this()
    
    /* CompleteClass */
    override def getEnumerator(): IEnumerator[String] = js.native
  }
}
