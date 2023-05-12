package typings.rcPicker

import typings.rcPicker.rcPickerBooleans.`false`
import typings.rcPicker.rcPickerInts.`0`
import typings.rcPicker.rcPickerInts.`1`
import typings.react.mod.RefObject
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseRangeOpenMod {
  
  @JSImport("rc-picker/es/hooks/useRangeOpen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    defaultOpen: Boolean,
    open: Boolean,
    activePickerIndex: `0` | `1`,
    changeOnBlur: Boolean,
    startInputRef: RefObject[HTMLInputElement],
    endInputRef: RefObject[HTMLInputElement],
    startSelectedValue: Any,
    endSelectedValue: Any
  ): js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultOpen.asInstanceOf[js.Any], open.asInstanceOf[js.Any], activePickerIndex.asInstanceOf[js.Any], changeOnBlur.asInstanceOf[js.Any], startInputRef.asInstanceOf[js.Any], endInputRef.asInstanceOf[js.Any], startSelectedValue.asInstanceOf[js.Any], endSelectedValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ]]
  inline def default(
    defaultOpen: Boolean,
    open: Boolean,
    activePickerIndex: `0` | `1`,
    changeOnBlur: Boolean,
    startInputRef: RefObject[HTMLInputElement],
    endInputRef: RefObject[HTMLInputElement],
    startSelectedValue: Any,
    endSelectedValue: Any,
    onOpenChange: js.Function1[/* open */ Boolean, Unit]
  ): js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultOpen.asInstanceOf[js.Any], open.asInstanceOf[js.Any], activePickerIndex.asInstanceOf[js.Any], changeOnBlur.asInstanceOf[js.Any], startInputRef.asInstanceOf[js.Any], endInputRef.asInstanceOf[js.Any], startSelectedValue.asInstanceOf[js.Any], endSelectedValue.asInstanceOf[js.Any], onOpenChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ]]
  inline def default(
    defaultOpen: Boolean,
    open: Boolean,
    activePickerIndex: Unit,
    changeOnBlur: Boolean,
    startInputRef: RefObject[HTMLInputElement],
    endInputRef: RefObject[HTMLInputElement],
    startSelectedValue: Any,
    endSelectedValue: Any
  ): js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultOpen.asInstanceOf[js.Any], open.asInstanceOf[js.Any], activePickerIndex.asInstanceOf[js.Any], changeOnBlur.asInstanceOf[js.Any], startInputRef.asInstanceOf[js.Any], endInputRef.asInstanceOf[js.Any], startSelectedValue.asInstanceOf[js.Any], endSelectedValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ]]
  inline def default(
    defaultOpen: Boolean,
    open: Boolean,
    activePickerIndex: Unit,
    changeOnBlur: Boolean,
    startInputRef: RefObject[HTMLInputElement],
    endInputRef: RefObject[HTMLInputElement],
    startSelectedValue: Any,
    endSelectedValue: Any,
    onOpenChange: js.Function1[/* open */ Boolean, Unit]
  ): js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultOpen.asInstanceOf[js.Any], open.asInstanceOf[js.Any], activePickerIndex.asInstanceOf[js.Any], changeOnBlur.asInstanceOf[js.Any], startInputRef.asInstanceOf[js.Any], endInputRef.asInstanceOf[js.Any], startSelectedValue.asInstanceOf[js.Any], endSelectedValue.asInstanceOf[js.Any], onOpenChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* open */ Boolean, 
    /* activeIndex */ `0` | `1`, 
    /* firstTimeOpen */ Boolean, 
    /* triggerOpen */ js.Function3[
      /* open */ Boolean, 
      /* activeIndex */ `0` | `1` | `false`, 
      /* source */ SourceType, 
      Unit
    ]
  ]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcPicker.rcPickerStrings.open
    - typings.rcPicker.rcPickerStrings.blur
    - typings.rcPicker.rcPickerStrings.confirm
    - typings.rcPicker.rcPickerStrings.cancel
    - typings.rcPicker.rcPickerStrings.clear
    - typings.rcPicker.rcPickerStrings.preset
  */
  trait SourceType extends StObject
  object SourceType {
    
    inline def blur: typings.rcPicker.rcPickerStrings.blur = "blur".asInstanceOf[typings.rcPicker.rcPickerStrings.blur]
    
    inline def cancel: typings.rcPicker.rcPickerStrings.cancel = "cancel".asInstanceOf[typings.rcPicker.rcPickerStrings.cancel]
    
    inline def clear: typings.rcPicker.rcPickerStrings.clear = "clear".asInstanceOf[typings.rcPicker.rcPickerStrings.clear]
    
    inline def confirm: typings.rcPicker.rcPickerStrings.confirm = "confirm".asInstanceOf[typings.rcPicker.rcPickerStrings.confirm]
    
    inline def open: typings.rcPicker.rcPickerStrings.open = "open".asInstanceOf[typings.rcPicker.rcPickerStrings.open]
    
    inline def preset: typings.rcPicker.rcPickerStrings.preset = "preset".asInstanceOf[typings.rcPicker.rcPickerStrings.preset]
  }
}
