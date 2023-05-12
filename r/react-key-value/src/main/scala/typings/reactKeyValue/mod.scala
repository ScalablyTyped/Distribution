package typings.reactKeyValue

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactKeyValue.anon.KeyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-key-value", "KeyValue")
  @js.native
  open class KeyValue protected ()
    extends Component[KeyValueProps, js.Object, Any] {
    def this(props: KeyValueProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: KeyValueProps, context: Any) = this()
    
    def handleKeyItemChange(index: js.BigInt, value: Any): Any = js.native
    
    def handleRemove(index: js.BigInt): Any = js.native
    
    def handleValueItemChange(index: js.BigInt, value: Any): Any = js.native
    
    def renderAddButton(): Any = js.native
    
    def renderKeyItem(index: js.BigInt, value: Any): Any = js.native
    
    def renderLabelText(text: String): Any = js.native
    
    def renderRows(): Any = js.native
    
    def renderValueItem(index: js.BigInt, value: Any): Any = js.native
    
    def toJSON(): Any = js.native
  }
  /* static members */
  object KeyValue {
    
    @JSImport("react-key-value", "KeyValue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-key-value", "KeyValue.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait KeyValueProps extends StObject {
    
    var customAddButtonRenderer: js.UndefOr[js.Function1[/* handleAddNew */ js.Function0[Any], ReactElement]] = js.undefined
    
    var hideLabels: js.UndefOr[Boolean] = js.undefined
    
    var keyInputPlaceholder: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* rows */ js.Array[KeyItem], Unit]] = js.undefined
    
    var rows: js.UndefOr[js.Array[KeyItem]] = js.undefined
    
    var valueInputPlaceholder: js.UndefOr[String] = js.undefined
  }
  object KeyValueProps {
    
    inline def apply(): KeyValueProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyValueProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyValueProps] (val x: Self) extends AnyVal {
      
      inline def setCustomAddButtonRenderer(value: /* handleAddNew */ js.Function0[Any] => ReactElement): Self = StObject.set(x, "customAddButtonRenderer", js.Any.fromFunction1(value))
      
      inline def setCustomAddButtonRendererUndefined: Self = StObject.set(x, "customAddButtonRenderer", js.undefined)
      
      inline def setHideLabels(value: Boolean): Self = StObject.set(x, "hideLabels", value.asInstanceOf[js.Any])
      
      inline def setHideLabelsUndefined: Self = StObject.set(x, "hideLabels", js.undefined)
      
      inline def setKeyInputPlaceholder(value: String): Self = StObject.set(x, "keyInputPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setKeyInputPlaceholderUndefined: Self = StObject.set(x, "keyInputPlaceholder", js.undefined)
      
      inline def setOnChange(value: /* rows */ js.Array[KeyItem] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRows(value: js.Array[KeyItem]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: KeyItem*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setValueInputPlaceholder(value: String): Self = StObject.set(x, "valueInputPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setValueInputPlaceholderUndefined: Self = StObject.set(x, "valueInputPlaceholder", js.undefined)
    }
  }
}
