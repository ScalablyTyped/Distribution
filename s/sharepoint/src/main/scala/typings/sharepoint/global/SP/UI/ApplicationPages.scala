package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.ClientRuntimeContext
import typings.sharepoint.SP.StringResult
import typings.sharepoint.SP.UI.ApplicationPages.ICalendarController
import typings.sharepoint.SP.UI.ApplicationPages.SelectorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationPages {
  
  @JSGlobal("SP.UI.ApplicationPages.BaseSelectorComponent")
  @js.native
  class BaseSelectorComponent protected ()
    extends typings.sharepoint.SP.UI.ApplicationPages.BaseSelectorComponent {
    def this(key: String, `type`: SelectorType) = this()
  }
  
  @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository")
  @js.native
  class CalendarInstanceRepository ()
    extends typings.sharepoint.SP.UI.ApplicationPages.CalendarInstanceRepository
  object CalendarInstanceRepository {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository.firstInstance")
    @js.native
    def firstInstance(): ICalendarController = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository.lookupInstance")
    @js.native
    def lookupInstance(instanceId: String): ICalendarController = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarInstanceRepository.registerInstance")
    @js.native
    def registerInstance(instanceId: String, contoller: ICalendarController): Unit = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.CalendarScope")
  @js.native
  object CalendarScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UI.ApplicationPages.CalendarScope with Double] = js.native
    
    /* 3 */ val daily: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.daily with Double = js.native
    
    /* 5 */ val dailyGroup: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.dailyGroup with Double = js.native
    
    /* 1 */ val monthly: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.monthly with Double = js.native
    
    /* 0 */ val nothing: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.nothing with Double = js.native
    
    /* 4 */ val weekly: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.weekly with Double = js.native
    
    /* 2 */ val weeklyGroup: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.weeklyGroup with Double = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.CalendarSelector")
  @js.native
  class CalendarSelector ()
    extends typings.sharepoint.SP.UI.ApplicationPages.CalendarSelector
  object CalendarSelector {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.CalendarSelector.instance")
    @js.native
    def instance(): typings.sharepoint.SP.UI.ApplicationPages.CalendarSelector = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters")
  @js.native
  class ClientPeoplePickerQueryParameters ()
    extends typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
  
  @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface")
  @js.native
  class ClientPeoplePickerWebServiceInterface ()
    extends typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface
  object ClientPeoplePickerWebServiceInterface {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface.clientPeoplePickerResolveUser")
    @js.native
    def clientPeoplePickerResolveUser(
      context: ClientRuntimeContext,
      queryParams: typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface.clientPeoplePickerSearchUser")
    @js.native
    def clientPeoplePickerSearchUser(
      context: ClientRuntimeContext,
      queryParams: typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface")
  @js.native
  class PeoplePickerWebServiceInterface ()
    extends typings.sharepoint.SP.UI.ApplicationPages.PeoplePickerWebServiceInterface
  object PeoplePickerWebServiceInterface {
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface.getSearchResults")
    @js.native
    def getSearchResults(
      context: ClientRuntimeContext,
      searchPattern: String,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String
    ): StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.UI.ApplicationPages.PeoplePickerWebServiceInterface.getSearchResultsByHierarchy")
    @js.native
    def getSearchResultsByHierarchy(
      context: ClientRuntimeContext,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String,
      contextUrl: String
    ): StringResult = js.native
  }
  
  @JSGlobal("SP.UI.ApplicationPages.ResolveEntity")
  @js.native
  class ResolveEntity ()
    extends typings.sharepoint.SP.UI.ApplicationPages.ResolveEntity
  
  @JSGlobal("SP.UI.ApplicationPages.SelectorSelectionEventArgs")
  @js.native
  class SelectorSelectionEventArgs protected ()
    extends typings.sharepoint.SP.UI.ApplicationPages.SelectorSelectionEventArgs {
    def this(entities: js.Any) = this()
  }
  
  @JSGlobal("SP.UI.ApplicationPages.SelectorType")
  @js.native
  object SelectorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UI.ApplicationPages.SelectorType with Double] = js.native
    
    /* 4 */ val event: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.event with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.none with Double = js.native
    
    /* 2 */ val people: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.people with Double = js.native
    
    /* 3 */ val people_And_Resource: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.people_And_Resource with Double = js.native
    
    /* 1 */ val resource: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.resource with Double = js.native
  }
}
