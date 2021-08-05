package typings.storybookUi

import typings.emotionSerialize.mod.Keyframes
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.KeyboardEvent
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.PickDetailedHTMLPropsHTML
import typings.storybookUi.anon.PickPropsWithChildrenIcon
import typings.storybookUi.anon.PropsWithChildrenPickPick
import typings.storybookUi.anon.RecordFeatureany
import typings.storybookUi.anon.Valid
import typings.storybookUi.anon.ValidString
import typings.storybookUi.storybookUiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsMod {
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Description")
  @js.native
  val Description: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Fade")
  @js.native
  val Fade: Keyframes = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "GridHeaderRow")
  @js.native
  val GridHeaderRow: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "GridWrapper")
  @js.native
  val GridWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "HeaderItem")
  @js.native
  val HeaderItem: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "Row")
  @js.native
  val Row: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "ShortcutsScreen")
  @js.native
  class ShortcutsScreen protected ()
    extends Component[ShortcutsScreenProps, ShortcutsScreenState, js.Any] {
    def this(props: ShortcutsScreenProps) = this()
    
    def displayError(activeElement: Feature): ValidationStates = js.native
    
    def displaySuccessMessage(activeElement: Feature): String = js.native
    
    def onBlur(): js.Promise[`false` | Unit] = js.native
    
    def onFocus(focusedInput: Feature): js.Function0[Unit] = js.native
    
    def onKeyDown(e: KeyboardEvent): `false` | Unit | js.Promise[Unit] = js.native
    
    def renderKeyForm(): Element = js.native
    
    def renderKeyInput(): js.Array[Element] = js.native
    
    def restoreDefault(): js.Promise[Unit] = js.native
    
    def restoreDefaults(): js.Promise[Unit] = js.native
    
    def saveShortcut(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "SuccessIcon")
  @js.native
  val SuccessIcon: StyledComponent[PickPropsWithChildrenIcon, ValidString, Theme] = js.native
  
  @JSImport("@storybook/ui/dist/settings/shortcuts", "TextInput")
  @js.native
  val TextInput: StyledComponent[PropsWithChildrenPickPick, Valid, Theme] = js.native
  
  /* keyof @storybook/ui.anon.AboutPage */ /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.fullScreen
    - typings.storybookUi.storybookUiStrings.togglePanel
    - typings.storybookUi.storybookUiStrings.panelPosition
    - typings.storybookUi.storybookUiStrings.toggleNav
    - typings.storybookUi.storybookUiStrings.toolbar
    - typings.storybookUi.storybookUiStrings.search
    - typings.storybookUi.storybookUiStrings.focusNav
    - typings.storybookUi.storybookUiStrings.focusIframe
    - typings.storybookUi.storybookUiStrings.focusPanel
    - typings.storybookUi.storybookUiStrings.prevComponent
    - typings.storybookUi.storybookUiStrings.nextComponent
    - typings.storybookUi.storybookUiStrings.prevStory
    - typings.storybookUi.storybookUiStrings.nextStory
    - typings.storybookUi.storybookUiStrings.shortcutsPage
    - typings.storybookUi.storybookUiStrings.aboutPage
    - typings.storybookUi.storybookUiStrings.collapseAll
    - typings.storybookUi.storybookUiStrings.expandAll
  */
  trait Feature extends StObject
  
  trait ShortcutsScreenProps extends StObject {
    
    var restoreAllDefaultShortcuts: js.Function
    
    var restoreDefaultShortcut: js.Function
    
    var setShortcut: js.Function
    
    var shortcutKeys: RecordFeatureany
  }
  object ShortcutsScreenProps {
    
    inline def apply(
      restoreAllDefaultShortcuts: js.Function,
      restoreDefaultShortcut: js.Function,
      setShortcut: js.Function,
      shortcutKeys: RecordFeatureany
    ): ShortcutsScreenProps = {
      val __obj = js.Dynamic.literal(restoreAllDefaultShortcuts = restoreAllDefaultShortcuts.asInstanceOf[js.Any], restoreDefaultShortcut = restoreDefaultShortcut.asInstanceOf[js.Any], setShortcut = setShortcut.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutsScreenProps]
    }
    
    extension [Self <: ShortcutsScreenProps](x: Self) {
      
      inline def setRestoreAllDefaultShortcuts(value: js.Function): Self = StObject.set(x, "restoreAllDefaultShortcuts", value.asInstanceOf[js.Any])
      
      inline def setRestoreDefaultShortcut(value: js.Function): Self = StObject.set(x, "restoreDefaultShortcut", value.asInstanceOf[js.Any])
      
      inline def setSetShortcut(value: js.Function): Self = StObject.set(x, "setShortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutKeys(value: RecordFeatureany): Self = StObject.set(x, "shortcutKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShortcutsScreenState extends StObject {
    
    var activeFeature: Feature
    
    var shortcutKeys: RecordFeatureany
    
    var successField: Feature
  }
  object ShortcutsScreenState {
    
    inline def apply(activeFeature: Feature, shortcutKeys: RecordFeatureany, successField: Feature): ShortcutsScreenState = {
      val __obj = js.Dynamic.literal(activeFeature = activeFeature.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any], successField = successField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutsScreenState]
    }
    
    extension [Self <: ShortcutsScreenState](x: Self) {
      
      inline def setActiveFeature(value: Feature): Self = StObject.set(x, "activeFeature", value.asInstanceOf[js.Any])
      
      inline def setShortcutKeys(value: RecordFeatureany): Self = StObject.set(x, "shortcutKeys", value.asInstanceOf[js.Any])
      
      inline def setSuccessField(value: Feature): Self = StObject.set(x, "successField", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.valid
    - typings.storybookUi.storybookUiStrings.error
    - typings.storybookUi.storybookUiStrings.warn
  */
  trait ValidationStates extends StObject
  object ValidationStates {
    
    inline def error: typings.storybookUi.storybookUiStrings.error = "error".asInstanceOf[typings.storybookUi.storybookUiStrings.error]
    
    inline def valid: typings.storybookUi.storybookUiStrings.valid = "valid".asInstanceOf[typings.storybookUi.storybookUiStrings.valid]
    
    inline def warn: typings.storybookUi.storybookUiStrings.warn = "warn".asInstanceOf[typings.storybookUi.storybookUiStrings.warn]
  }
}
