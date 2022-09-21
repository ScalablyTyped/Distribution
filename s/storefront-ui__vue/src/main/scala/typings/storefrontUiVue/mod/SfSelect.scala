package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSelect extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSelect")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var html: String
    
    var index: Double
    
    var isActive: Boolean
    
    var isSelected: Boolean
    
    var maxHeight: String
  }
  object Computed {
    
    inline def apply(html: String, index: Double, isActive: Boolean, isSelected: Boolean, maxHeight: String): Computed = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: () => Data, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var focusedOption: String
    
    var indexes: js.Object
    
    var open: Boolean
    
    var optionHeight: Double
    
    var options: js.Array[Any]
  }
  object Data {
    
    inline def apply(
      focusedOption: String,
      indexes: js.Object,
      open: Boolean,
      optionHeight: Double,
      options: js.Array[Any]
    ): Data = {
      val __obj = js.Dynamic.literal(focusedOption = focusedOption.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], optionHeight = optionHeight.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setFocusedOption(value: String): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      inline def setIndexes(value: js.Object): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOptionHeight(value: Double): Self = StObject.set(x, "optionHeight", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def closeHandler(): Unit
    
    def enter(): Unit
    
    def move(payload: Double): Unit
    
    def openHandler(): Unit
    
    def toggle(event: MouseEvent): Unit
    
    def update(index: Double): Unit
  }
  object Methods {
    
    inline def apply(
      closeHandler: () => Unit,
      enter: () => Unit,
      move: Double => Unit,
      openHandler: () => Unit,
      toggle: MouseEvent => Unit,
      update: Double => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(closeHandler = js.Any.fromFunction0(closeHandler), enter = js.Any.fromFunction0(enter), move = js.Any.fromFunction1(move), openHandler = js.Any.fromFunction0(openHandler), toggle = js.Any.fromFunction1(toggle), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCloseHandler(value: () => Unit): Self = StObject.set(x, "closeHandler", js.Any.fromFunction0(value))
      
      inline def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      inline def setMove(value: Double => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setOpenHandler(value: () => Unit): Self = StObject.set(x, "openHandler", js.Any.fromFunction0(value))
      
      inline def setToggle(value: MouseEvent => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var disabled: Boolean
    
    var errorMessage: String
    
    var label: String
    
    var required: Boolean
    
    var selected: String | Double | js.Object
    
    var size: Double
    
    var valid: Boolean
  }
  object Props {
    
    inline def apply(
      disabled: Boolean,
      errorMessage: String,
      label: String,
      required: Boolean,
      selected: String | Double | js.Object,
      size: Double,
      valid: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String | Double | js.Object): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSelect.foo` */
  override def _to: Constructor = ^
}
