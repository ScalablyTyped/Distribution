package typings.rcInput

import typings.rcInput.interfaceMod.BaseInputProps
import typings.rcInput.interfaceMod.InputProps
import typings.rcInput.rcInputStrings.all
import typings.rcInput.rcInputStrings.end
import typings.rcInput.rcInputStrings.start
import typings.react.mod.ChangeEvent
import typings.react.mod.CompositionEvent
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilsMod {
  
  @JSImport("rc-input/es/utils/commonUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixControlledValue[T](value: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixControlledValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasAddon(props: BaseInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasAddon(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasPrefixSuffix(props: BaseInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def hasPrefixSuffix(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveOnChange(target: HTMLInputElement, e: ChangeEvent[HTMLInputElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: ChangeEvent[HTMLInputElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: CompositionEvent[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: CompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: CompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: CompositionEvent[HTMLElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLInputElement, e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLInputElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: ChangeEvent[HTMLTextAreaElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: CompositionEvent[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: CompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: CompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: CompositionEvent[HTMLElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(target: HTMLTextAreaElement, e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveOnChange(
    target: HTMLTextAreaElement,
    e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def triggerFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")().asInstanceOf[Unit]
  inline def triggerFocus(element: Unit, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLInputElement, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def triggerFocus(element: HTMLTextAreaElement, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait InputFocusOptions
    extends StObject
       with FocusOptions {
    
    var cursor: js.UndefOr[start | end | all] = js.undefined
  }
  object InputFocusOptions {
    
    inline def apply(): InputFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputFocusOptions]
    }
    
    extension [Self <: InputFocusOptions](x: Self) {
      
      inline def setCursor(value: start | end | all): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    }
  }
}
