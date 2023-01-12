package typings.reactKeyHandler

import typings.react.mod.global.JSX.Element
import typings.reactKeyHandler.reactKeyHandlerStrings.keydown
import typings.reactKeyHandler.reactKeyHandlerStrings.keypress
import typings.reactKeyHandler.reactKeyHandlerStrings.keyup
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-key-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ReactKeyHandlerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-key-handler", "KEYDOWN")
  @js.native
  val KEYDOWN: _KEYDOWN = js.native
  
  @JSImport("react-key-handler", "KEYPRESS")
  @js.native
  val KEYPRESS: _KEYPRESS = js.native
  
  @JSImport("react-key-handler", "KEYUP")
  @js.native
  val KEYUP: _KEYUP = js.native
  
  inline def keyHandleDecorator(): js.Function1[
    /* props */ ReactKeyHandlerProps, 
    js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyHandleDecorator")().asInstanceOf[js.Function1[
    /* props */ ReactKeyHandlerProps, 
    js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]]
  ]]
  inline def keyHandleDecorator(matcher: Matcher): js.Function1[
    /* props */ ReactKeyHandlerProps, 
    js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyHandleDecorator")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ ReactKeyHandlerProps, 
    js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]]
  ]]
  
  inline def keyHandler(props: ReactKeyHandlerIntrinsicProps): js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyHandler")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]]]
  
  inline def keyToggleHandler(props: ReactKeyHandlerIntrinsicProps): js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyToggleHandler")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ Element, js.Function1[/* repeated */ Any, Element]]]
  
  type Matcher = js.Function2[/* event */ KeyboardEvent, /* ref */ ReactKeyHandlerIntrinsicProps, Boolean]
  
  trait ReactKeyHandlerIntrinsicProps extends StObject {
    
    /**
      *  Any given [KeyboardEvent.code](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/code)
      */
    var code: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      *  Any given [KeyboardEvent.keyCode](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/keyCode)
      *  @deprecated Deprecated in favour of `code`
      */
    var keyCode: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      *  Keyboard event type to listen to.
      *  @default 'keyup'
      */
    var keyEventName: js.UndefOr[_KEYDOWN | _KEYPRESS | _KEYUP] = js.undefined
    
    /**
      * Any given [KeyboardEvent.key](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key)
      */
    var keyValue: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ReactKeyHandlerIntrinsicProps {
    
    inline def apply(): ReactKeyHandlerIntrinsicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactKeyHandlerIntrinsicProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactKeyHandlerIntrinsicProps] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String | js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value*))
      
      inline def setKeyCode(value: Double | js.Array[Double]): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setKeyCodeVarargs(value: Double*): Self = StObject.set(x, "keyCode", js.Array(value*))
      
      inline def setKeyEventName(value: _KEYDOWN | _KEYPRESS | _KEYUP): Self = StObject.set(x, "keyEventName", value.asInstanceOf[js.Any])
      
      inline def setKeyEventNameUndefined: Self = StObject.set(x, "keyEventName", js.undefined)
      
      inline def setKeyValue(value: String | js.Array[String]): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
      
      inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
      
      inline def setKeyValueVarargs(value: String*): Self = StObject.set(x, "keyValue", js.Array(value*))
    }
  }
  
  trait ReactKeyHandlerProps
    extends StObject
       with ReactKeyHandlerIntrinsicProps {
    
    /**
      * Callback that is called when they key is handled
      * @param event The event object
      */
    def onKeyHandle(event: typings.react.mod.KeyboardEvent[typings.std.Element]): Unit
  }
  object ReactKeyHandlerProps {
    
    inline def apply(onKeyHandle: typings.react.mod.KeyboardEvent[typings.std.Element] => Unit): ReactKeyHandlerProps = {
      val __obj = js.Dynamic.literal(onKeyHandle = js.Any.fromFunction1(onKeyHandle))
      __obj.asInstanceOf[ReactKeyHandlerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactKeyHandlerProps] (val x: Self) extends AnyVal {
      
      inline def setOnKeyHandle(value: typings.react.mod.KeyboardEvent[typings.std.Element] => Unit): Self = StObject.set(x, "onKeyHandle", js.Any.fromFunction1(value))
    }
  }
  
  type _KEYDOWN = keydown
  
  type _KEYPRESS = keypress
  
  type _KEYUP = keyup
}
