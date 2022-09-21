package typings.reactWidgets

import typings.react.mod.ReactNode
import typings.reactWidgets.anon.PartialMessagesCreateOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMessagesMod {
  
  @JSImport("react-widgets/esm/messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMessages(): ProcessedMessages = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")().asInstanceOf[ProcessedMessages]
  inline def getMessages(defaults: UserProvidedMessages): ProcessedMessages = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")(defaults.asInstanceOf[js.Any]).asInstanceOf[ProcessedMessages]
  
  inline def useMessagesWithDefaults(): ProcessedMessages = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessagesWithDefaults")().asInstanceOf[ProcessedMessages]
  inline def useMessagesWithDefaults(defaults: PartialMessagesCreateOption): ProcessedMessages = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessagesWithDefaults")(defaults.asInstanceOf[js.Any]).asInstanceOf[ProcessedMessages]
  
  type LabelMessage = String | (js.Function1[/* ctx */ Any, String])
  
  trait Messages extends StObject {
    
    def createOption(_value: Any, searchTerm: String): ReactNode
    
    var dateButton: LabelMessage
    
    var decrement: LabelMessage
    
    var emptyFilter: RenderableMessage
    
    var emptyList: RenderableMessage
    
    var increment: LabelMessage
    
    var moveBack: LabelMessage
    
    var moveForward: LabelMessage
    
    var moveToday: LabelMessage
    
    var noneSelected: LabelMessage
    
    var openCombobox: LabelMessage
    
    var removeLabel: LabelMessage
    
    def selectedItems(labels: js.Array[String]): String
    
    var tagsLabel: LabelMessage
  }
  object Messages {
    
    inline def apply(
      createOption: (Any, String) => ReactNode,
      dateButton: LabelMessage,
      decrement: LabelMessage,
      increment: LabelMessage,
      moveBack: LabelMessage,
      moveForward: LabelMessage,
      moveToday: LabelMessage,
      noneSelected: LabelMessage,
      openCombobox: LabelMessage,
      removeLabel: LabelMessage,
      selectedItems: js.Array[String] => String,
      tagsLabel: LabelMessage
    ): Messages = {
      val __obj = js.Dynamic.literal(createOption = js.Any.fromFunction2(createOption), dateButton = dateButton.asInstanceOf[js.Any], decrement = decrement.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], moveBack = moveBack.asInstanceOf[js.Any], moveForward = moveForward.asInstanceOf[js.Any], moveToday = moveToday.asInstanceOf[js.Any], noneSelected = noneSelected.asInstanceOf[js.Any], openCombobox = openCombobox.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], selectedItems = js.Any.fromFunction1(selectedItems), tagsLabel = tagsLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setCreateOption(value: (Any, String) => ReactNode): Self = StObject.set(x, "createOption", js.Any.fromFunction2(value))
      
      inline def setDateButton(value: LabelMessage): Self = StObject.set(x, "dateButton", value.asInstanceOf[js.Any])
      
      inline def setDateButtonFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "dateButton", js.Any.fromFunction1(value))
      
      inline def setDecrement(value: LabelMessage): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
      
      inline def setDecrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      inline def setEmptyFilter(value: RenderableMessage): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
      
      inline def setEmptyFilterFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyFilter", js.Any.fromFunction0(value))
      
      inline def setEmptyFilterUndefined: Self = StObject.set(x, "emptyFilter", js.undefined)
      
      inline def setEmptyList(value: RenderableMessage): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      inline def setEmptyListFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyList", js.Any.fromFunction0(value))
      
      inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      inline def setIncrement(value: LabelMessage): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setMoveBack(value: LabelMessage): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
      
      inline def setMoveBackFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveBack", js.Any.fromFunction1(value))
      
      inline def setMoveForward(value: LabelMessage): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
      
      inline def setMoveForwardFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
      
      inline def setMoveToday(value: LabelMessage): Self = StObject.set(x, "moveToday", value.asInstanceOf[js.Any])
      
      inline def setMoveTodayFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveToday", js.Any.fromFunction1(value))
      
      inline def setNoneSelected(value: LabelMessage): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
      
      inline def setNoneSelectedFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "noneSelected", js.Any.fromFunction1(value))
      
      inline def setOpenCombobox(value: LabelMessage): Self = StObject.set(x, "openCombobox", value.asInstanceOf[js.Any])
      
      inline def setOpenComboboxFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "openCombobox", js.Any.fromFunction1(value))
      
      inline def setRemoveLabel(value: LabelMessage): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
      
      inline def setSelectedItems(value: js.Array[String] => String): Self = StObject.set(x, "selectedItems", js.Any.fromFunction1(value))
      
      inline def setTagsLabel(value: LabelMessage): Self = StObject.set(x, "tagsLabel", value.asInstanceOf[js.Any])
      
      inline def setTagsLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "tagsLabel", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {[ P in keyof react-widgets.react-widgets/esm/messages.Messages ]: react-widgets.react-widgets/esm/messages.Messages[P] extends std.Function? react-widgets.react-widgets/esm/messages.Messages[P] : (): string} */
  trait ProcessedMessages extends StObject {
    
    var createOption: js.Function0[String] | (js.Function2[/* _value */ Any, /* searchTerm */ String, ReactNode])
    
    var dateButton: js.Function0[String] | LabelMessage
    
    var decrement: js.Function0[String] | LabelMessage
    
    var emptyFilter: js.Function0[String] | RenderableMessage
    
    var emptyList: js.Function0[String] | RenderableMessage
    
    var increment: js.Function0[String] | LabelMessage
    
    var moveBack: js.Function0[String] | LabelMessage
    
    var moveForward: js.Function0[String] | LabelMessage
    
    var moveToday: js.Function0[String] | LabelMessage
    
    var noneSelected: js.Function0[String] | LabelMessage
    
    var openCombobox: js.Function0[String] | LabelMessage
    
    var removeLabel: js.Function0[String] | LabelMessage
    
    var selectedItems: js.Function0[String] | (js.Function1[/* labels */ js.Array[String], String])
    
    var tagsLabel: js.Function0[String] | LabelMessage
  }
  object ProcessedMessages {
    
    inline def apply(
      createOption: js.Function0[String] | (js.Function2[/* _value */ Any, /* searchTerm */ String, ReactNode]),
      dateButton: js.Function0[String] | LabelMessage,
      decrement: js.Function0[String] | LabelMessage,
      increment: js.Function0[String] | LabelMessage,
      moveBack: js.Function0[String] | LabelMessage,
      moveForward: js.Function0[String] | LabelMessage,
      moveToday: js.Function0[String] | LabelMessage,
      noneSelected: js.Function0[String] | LabelMessage,
      openCombobox: js.Function0[String] | LabelMessage,
      removeLabel: js.Function0[String] | LabelMessage,
      selectedItems: js.Function0[String] | (js.Function1[/* labels */ js.Array[String], String]),
      tagsLabel: js.Function0[String] | LabelMessage
    ): ProcessedMessages = {
      val __obj = js.Dynamic.literal(createOption = createOption.asInstanceOf[js.Any], dateButton = dateButton.asInstanceOf[js.Any], decrement = decrement.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], moveBack = moveBack.asInstanceOf[js.Any], moveForward = moveForward.asInstanceOf[js.Any], moveToday = moveToday.asInstanceOf[js.Any], noneSelected = noneSelected.asInstanceOf[js.Any], openCombobox = openCombobox.asInstanceOf[js.Any], removeLabel = removeLabel.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], tagsLabel = tagsLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedMessages]
    }
    
    extension [Self <: ProcessedMessages](x: Self) {
      
      inline def setCreateOption(value: js.Function0[String] | (js.Function2[/* _value */ Any, /* searchTerm */ String, ReactNode])): Self = StObject.set(x, "createOption", value.asInstanceOf[js.Any])
      
      inline def setCreateOptionFunction0(value: () => String): Self = StObject.set(x, "createOption", js.Any.fromFunction0(value))
      
      inline def setCreateOptionFunction2(value: (/* _value */ Any, /* searchTerm */ String) => ReactNode): Self = StObject.set(x, "createOption", js.Any.fromFunction2(value))
      
      inline def setDateButton(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "dateButton", value.asInstanceOf[js.Any])
      
      inline def setDateButtonFunction0(value: () => String): Self = StObject.set(x, "dateButton", js.Any.fromFunction0(value))
      
      inline def setDateButtonFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "dateButton", js.Any.fromFunction1(value))
      
      inline def setDecrement(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
      
      inline def setDecrementFunction0(value: () => String): Self = StObject.set(x, "decrement", js.Any.fromFunction0(value))
      
      inline def setDecrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      inline def setEmptyFilter(value: js.Function0[String] | RenderableMessage): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
      
      inline def setEmptyFilterFunction0(value: () => ReactNode | String): Self = StObject.set(x, "emptyFilter", js.Any.fromFunction0(value))
      
      inline def setEmptyFilterUndefined: Self = StObject.set(x, "emptyFilter", js.undefined)
      
      inline def setEmptyList(value: js.Function0[String] | RenderableMessage): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      inline def setEmptyListFunction0(value: () => ReactNode | String): Self = StObject.set(x, "emptyList", js.Any.fromFunction0(value))
      
      inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      inline def setIncrement(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementFunction0(value: () => String): Self = StObject.set(x, "increment", js.Any.fromFunction0(value))
      
      inline def setIncrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setMoveBack(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
      
      inline def setMoveBackFunction0(value: () => String): Self = StObject.set(x, "moveBack", js.Any.fromFunction0(value))
      
      inline def setMoveBackFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveBack", js.Any.fromFunction1(value))
      
      inline def setMoveForward(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
      
      inline def setMoveForwardFunction0(value: () => String): Self = StObject.set(x, "moveForward", js.Any.fromFunction0(value))
      
      inline def setMoveForwardFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
      
      inline def setMoveToday(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "moveToday", value.asInstanceOf[js.Any])
      
      inline def setMoveTodayFunction0(value: () => String): Self = StObject.set(x, "moveToday", js.Any.fromFunction0(value))
      
      inline def setMoveTodayFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveToday", js.Any.fromFunction1(value))
      
      inline def setNoneSelected(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
      
      inline def setNoneSelectedFunction0(value: () => String): Self = StObject.set(x, "noneSelected", js.Any.fromFunction0(value))
      
      inline def setNoneSelectedFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "noneSelected", js.Any.fromFunction1(value))
      
      inline def setOpenCombobox(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "openCombobox", value.asInstanceOf[js.Any])
      
      inline def setOpenComboboxFunction0(value: () => String): Self = StObject.set(x, "openCombobox", js.Any.fromFunction0(value))
      
      inline def setOpenComboboxFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "openCombobox", js.Any.fromFunction1(value))
      
      inline def setRemoveLabel(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveLabelFunction0(value: () => String): Self = StObject.set(x, "removeLabel", js.Any.fromFunction0(value))
      
      inline def setRemoveLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
      
      inline def setSelectedItems(value: js.Function0[String] | (js.Function1[/* labels */ js.Array[String], String])): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsFunction0(value: () => String): Self = StObject.set(x, "selectedItems", js.Any.fromFunction0(value))
      
      inline def setSelectedItemsFunction1(value: /* labels */ js.Array[String] => String): Self = StObject.set(x, "selectedItems", js.Any.fromFunction1(value))
      
      inline def setTagsLabel(value: js.Function0[String] | LabelMessage): Self = StObject.set(x, "tagsLabel", value.asInstanceOf[js.Any])
      
      inline def setTagsLabelFunction0(value: () => String): Self = StObject.set(x, "tagsLabel", js.Any.fromFunction0(value))
      
      inline def setTagsLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "tagsLabel", js.Any.fromFunction1(value))
    }
  }
  
  type RenderableMessage = ReactNode | js.Function0[ReactNode]
  
  /* Inlined std.Partial<react-widgets.react-widgets/esm/messages.Messages> */
  trait UserProvidedMessages extends StObject {
    
    var createOption: js.UndefOr[js.Function2[/* _value */ Any, /* searchTerm */ String, ReactNode]] = js.undefined
    
    var dateButton: js.UndefOr[LabelMessage] = js.undefined
    
    var decrement: js.UndefOr[LabelMessage] = js.undefined
    
    var emptyFilter: js.UndefOr[RenderableMessage] = js.undefined
    
    var emptyList: js.UndefOr[RenderableMessage] = js.undefined
    
    var increment: js.UndefOr[LabelMessage] = js.undefined
    
    var moveBack: js.UndefOr[LabelMessage] = js.undefined
    
    var moveForward: js.UndefOr[LabelMessage] = js.undefined
    
    var moveToday: js.UndefOr[LabelMessage] = js.undefined
    
    var noneSelected: js.UndefOr[LabelMessage] = js.undefined
    
    var openCombobox: js.UndefOr[LabelMessage] = js.undefined
    
    var removeLabel: js.UndefOr[LabelMessage] = js.undefined
    
    var selectedItems: js.UndefOr[js.Function1[/* labels */ js.Array[String], String]] = js.undefined
    
    var tagsLabel: js.UndefOr[LabelMessage] = js.undefined
  }
  object UserProvidedMessages {
    
    inline def apply(): UserProvidedMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProvidedMessages]
    }
    
    extension [Self <: UserProvidedMessages](x: Self) {
      
      inline def setCreateOption(value: (/* _value */ Any, /* searchTerm */ String) => ReactNode): Self = StObject.set(x, "createOption", js.Any.fromFunction2(value))
      
      inline def setCreateOptionUndefined: Self = StObject.set(x, "createOption", js.undefined)
      
      inline def setDateButton(value: LabelMessage): Self = StObject.set(x, "dateButton", value.asInstanceOf[js.Any])
      
      inline def setDateButtonFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "dateButton", js.Any.fromFunction1(value))
      
      inline def setDateButtonUndefined: Self = StObject.set(x, "dateButton", js.undefined)
      
      inline def setDecrement(value: LabelMessage): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
      
      inline def setDecrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "decrement", js.Any.fromFunction1(value))
      
      inline def setDecrementUndefined: Self = StObject.set(x, "decrement", js.undefined)
      
      inline def setEmptyFilter(value: RenderableMessage): Self = StObject.set(x, "emptyFilter", value.asInstanceOf[js.Any])
      
      inline def setEmptyFilterFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyFilter", js.Any.fromFunction0(value))
      
      inline def setEmptyFilterUndefined: Self = StObject.set(x, "emptyFilter", js.undefined)
      
      inline def setEmptyList(value: RenderableMessage): Self = StObject.set(x, "emptyList", value.asInstanceOf[js.Any])
      
      inline def setEmptyListFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyList", js.Any.fromFunction0(value))
      
      inline def setEmptyListUndefined: Self = StObject.set(x, "emptyList", js.undefined)
      
      inline def setIncrement(value: LabelMessage): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setMoveBack(value: LabelMessage): Self = StObject.set(x, "moveBack", value.asInstanceOf[js.Any])
      
      inline def setMoveBackFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveBack", js.Any.fromFunction1(value))
      
      inline def setMoveBackUndefined: Self = StObject.set(x, "moveBack", js.undefined)
      
      inline def setMoveForward(value: LabelMessage): Self = StObject.set(x, "moveForward", value.asInstanceOf[js.Any])
      
      inline def setMoveForwardFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
      
      inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
      
      inline def setMoveToday(value: LabelMessage): Self = StObject.set(x, "moveToday", value.asInstanceOf[js.Any])
      
      inline def setMoveTodayFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "moveToday", js.Any.fromFunction1(value))
      
      inline def setMoveTodayUndefined: Self = StObject.set(x, "moveToday", js.undefined)
      
      inline def setNoneSelected(value: LabelMessage): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
      
      inline def setNoneSelectedFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "noneSelected", js.Any.fromFunction1(value))
      
      inline def setNoneSelectedUndefined: Self = StObject.set(x, "noneSelected", js.undefined)
      
      inline def setOpenCombobox(value: LabelMessage): Self = StObject.set(x, "openCombobox", value.asInstanceOf[js.Any])
      
      inline def setOpenComboboxFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "openCombobox", js.Any.fromFunction1(value))
      
      inline def setOpenComboboxUndefined: Self = StObject.set(x, "openCombobox", js.undefined)
      
      inline def setRemoveLabel(value: LabelMessage): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "removeLabel", js.Any.fromFunction1(value))
      
      inline def setRemoveLabelUndefined: Self = StObject.set(x, "removeLabel", js.undefined)
      
      inline def setSelectedItems(value: /* labels */ js.Array[String] => String): Self = StObject.set(x, "selectedItems", js.Any.fromFunction1(value))
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setTagsLabel(value: LabelMessage): Self = StObject.set(x, "tagsLabel", value.asInstanceOf[js.Any])
      
      inline def setTagsLabelFunction1(value: /* ctx */ Any => String): Self = StObject.set(x, "tagsLabel", js.Any.fromFunction1(value))
      
      inline def setTagsLabelUndefined: Self = StObject.set(x, "tagsLabel", js.undefined)
    }
  }
}
