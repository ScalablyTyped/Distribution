package typings.sharepoint.global.SP.UI

import typings.sharepoint.SP.ClientRuntimeContext
import typings.sharepoint.SP.StringResult
import typings.sharepoint.SP.UI.ApplicationPages.ICalendarController
import typings.sharepoint.SP.UI.ApplicationPages.SelectorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages")
@js.native
object ApplicationPages extends js.Object {
  @js.native
  class BaseSelectorComponent protected ()
    extends typings.sharepoint.SP.UI.ApplicationPages.BaseSelectorComponent {
    def this(key: String, `type`: SelectorType) = this()
  }
  
  @js.native
  class CalendarInstanceRepository ()
    extends typings.sharepoint.SP.UI.ApplicationPages.CalendarInstanceRepository
  
  @js.native
  class CalendarSelector ()
    extends typings.sharepoint.SP.UI.ApplicationPages.CalendarSelector
  
  @js.native
  class ClientPeoplePickerQueryParameters ()
    extends typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
  
  @js.native
  class ClientPeoplePickerWebServiceInterface ()
    extends typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerWebServiceInterface
  
  @js.native
  class PeoplePickerWebServiceInterface ()
    extends typings.sharepoint.SP.UI.ApplicationPages.PeoplePickerWebServiceInterface
  
  @js.native
  class ResolveEntity ()
    extends typings.sharepoint.SP.UI.ApplicationPages.ResolveEntity
  
  @js.native
  class SelectorSelectionEventArgs protected ()
    extends typings.sharepoint.SP.UI.ApplicationPages.SelectorSelectionEventArgs {
    def this(entities: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object CalendarInstanceRepository extends js.Object {
    def firstInstance(): ICalendarController = js.native
    def lookupInstance(instanceId: String): ICalendarController = js.native
    def registerInstance(instanceId: String, contoller: ICalendarController): Unit = js.native
  }
  
  @js.native
  object CalendarScope extends js.Object {
    /* 3 */ val daily: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.daily with Double = js.native
    /* 5 */ val dailyGroup: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.dailyGroup with Double = js.native
    /* 1 */ val monthly: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.monthly with Double = js.native
    /* 0 */ val nothing: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.nothing with Double = js.native
    /* 4 */ val weekly: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.weekly with Double = js.native
    /* 2 */ val weeklyGroup: typings.sharepoint.SP.UI.ApplicationPages.CalendarScope.weeklyGroup with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UI.ApplicationPages.CalendarScope with Double] = js.native
  }
  
  /* static members */
  @js.native
  object CalendarSelector extends js.Object {
    def instance(): typings.sharepoint.SP.UI.ApplicationPages.CalendarSelector = js.native
  }
  
  /* static members */
  @js.native
  object ClientPeoplePickerWebServiceInterface extends js.Object {
    def clientPeoplePickerResolveUser(
      context: ClientRuntimeContext,
      queryParams: typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
    def clientPeoplePickerSearchUser(
      context: ClientRuntimeContext,
      queryParams: typings.sharepoint.SP.UI.ApplicationPages.ClientPeoplePickerQueryParameters
    ): StringResult = js.native
  }
  
  /* static members */
  @js.native
  object PeoplePickerWebServiceInterface extends js.Object {
    def getSearchResults(
      context: ClientRuntimeContext,
      searchPattern: String,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String
    ): StringResult = js.native
    def getSearchResultsByHierarchy(
      context: ClientRuntimeContext,
      providerID: String,
      hierarchyNodeID: String,
      entityTypes: String,
      contextUrl: String
    ): StringResult = js.native
  }
  
  @js.native
  object SelectorType extends js.Object {
    /* 4 */ val event: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.event with Double = js.native
    /* 0 */ val none: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.none with Double = js.native
    /* 2 */ val people: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.people with Double = js.native
    /* 3 */ val people_And_Resource: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.people_And_Resource with Double = js.native
    /* 1 */ val resource: typings.sharepoint.SP.UI.ApplicationPages.SelectorType.resource with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.UI.ApplicationPages.SelectorType with Double] = js.native
  }
  
}

