package typings.reactTypist

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactTypist.mod.Typist.BackSpaceProps
import typings.reactTypist.mod.Typist.CurrentTextProps
import typings.reactTypist.mod.Typist.CursorProps
import typings.reactTypist.mod.Typist.DelayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typist", JSImport.Default)
  @js.native
  open class default protected () extends Typist {
    def this(props: TypistProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TypistProps, context: Any) = this()
  }
  object default {
    
    @JSImport("react-typist", "default.Backspace")
    @js.native
    open class Backspace protected ()
      extends typings.reactTypist.mod.Typist.Backspace {
      def this(props: BackSpaceProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: BackSpaceProps, context: Any) = this()
    }
    
    @JSImport("react-typist", "default.Delay")
    @js.native
    open class Delay protected ()
      extends typings.reactTypist.mod.Typist.Delay {
      def this(props: DelayProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DelayProps, context: Any) = this()
    }
  }
  
  @JSImport("react-typist", "Typist")
  @js.native
  open class Typist protected ()
    extends Component[TypistProps, js.Object, Any] {
    def this(props: TypistProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TypistProps, context: Any) = this()
  }
  object Typist {
    
    @JSImport("react-typist", "Typist.Backspace")
    @js.native
    open class Backspace protected ()
      extends Component[BackSpaceProps, js.Object, Any] {
      def this(props: BackSpaceProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: BackSpaceProps, context: Any) = this()
    }
    
    @JSImport("react-typist", "Typist.Delay")
    @js.native
    open class Delay protected ()
      extends Component[DelayProps, js.Object, Any] {
      def this(props: DelayProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DelayProps, context: Any) = this()
    }
    
    trait BackSpaceProps extends StObject {
      
      var count: js.UndefOr[Double] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
    }
    object BackSpaceProps {
      
      inline def apply(): BackSpaceProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BackSpaceProps]
      }
      
      extension [Self <: BackSpaceProps](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      }
    }
    
    trait CurrentTextProps extends StObject {
      
      var charIdx: Double
      
      var character: String
      
      def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ Any, Double]
      
      var line: String
      
      var lineIdx: Double
    }
    object CurrentTextProps {
      
      inline def apply(
        charIdx: Double,
        character: String,
        defDelayGenerator: (Double, Double) => js.Function1[/* params */ Any, Double],
        line: String,
        lineIdx: Double
      ): CurrentTextProps = {
        val __obj = js.Dynamic.literal(charIdx = charIdx.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], defDelayGenerator = js.Any.fromFunction2(defDelayGenerator), line = line.asInstanceOf[js.Any], lineIdx = lineIdx.asInstanceOf[js.Any])
        __obj.asInstanceOf[CurrentTextProps]
      }
      
      extension [Self <: CurrentTextProps](x: Self) {
        
        inline def setCharIdx(value: Double): Self = StObject.set(x, "charIdx", value.asInstanceOf[js.Any])
        
        inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
        
        inline def setDefDelayGenerator(value: (Double, Double) => js.Function1[/* params */ Any, Double]): Self = StObject.set(x, "defDelayGenerator", js.Any.fromFunction2(value))
        
        inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLineIdx(value: Double): Self = StObject.set(x, "lineIdx", value.asInstanceOf[js.Any])
      }
    }
    
    trait CursorProps extends StObject {
      
      var blink: js.UndefOr[Boolean] = js.undefined
      
      var element: js.UndefOr[String] = js.undefined
      
      var hideWhenDone: js.UndefOr[Boolean] = js.undefined
      
      var hideWhenDoneDelay: js.UndefOr[Double] = js.undefined
      
      var show: js.UndefOr[Boolean] = js.undefined
    }
    object CursorProps {
      
      inline def apply(): CursorProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CursorProps]
      }
      
      extension [Self <: CursorProps](x: Self) {
        
        inline def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
        
        inline def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
        
        inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
        
        inline def setHideWhenDone(value: Boolean): Self = StObject.set(x, "hideWhenDone", value.asInstanceOf[js.Any])
        
        inline def setHideWhenDoneDelay(value: Double): Self = StObject.set(x, "hideWhenDoneDelay", value.asInstanceOf[js.Any])
        
        inline def setHideWhenDoneDelayUndefined: Self = StObject.set(x, "hideWhenDoneDelay", js.undefined)
        
        inline def setHideWhenDoneUndefined: Self = StObject.set(x, "hideWhenDone", js.undefined)
        
        inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      }
    }
    
    trait DelayProps extends StObject {
      
      var ms: Double
    }
    object DelayProps {
      
      inline def apply(ms: Double): DelayProps = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DelayProps]
      }
      
      extension [Self <: DelayProps](x: Self) {
        
        inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait TypistProps extends StObject {
    
    var avgTypingDelay: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cursor: js.UndefOr[CursorProps] = js.undefined
    
    var delayGenerator: js.UndefOr[
        js.Function3[/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps, Double]
      ] = js.undefined
    
    var onCharacterTyped: js.UndefOr[js.Function2[/* char */ String, /* charIndex */ Double, Unit]] = js.undefined
    
    var onLineTyped: js.UndefOr[js.Function2[/* line */ String, /* lineIndex */ Double, Unit]] = js.undefined
    
    var onTypingDone: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var startDelay: js.UndefOr[Double] = js.undefined
    
    var stdTypingDelay: js.UndefOr[Double] = js.undefined
  }
  object TypistProps {
    
    inline def apply(): TypistProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypistProps]
    }
    
    extension [Self <: TypistProps](x: Self) {
      
      inline def setAvgTypingDelay(value: Double): Self = StObject.set(x, "avgTypingDelay", value.asInstanceOf[js.Any])
      
      inline def setAvgTypingDelayUndefined: Self = StObject.set(x, "avgTypingDelay", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCursor(value: CursorProps): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDelayGenerator(value: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double): Self = StObject.set(x, "delayGenerator", js.Any.fromFunction3(value))
      
      inline def setDelayGeneratorUndefined: Self = StObject.set(x, "delayGenerator", js.undefined)
      
      inline def setOnCharacterTyped(value: (/* char */ String, /* charIndex */ Double) => Unit): Self = StObject.set(x, "onCharacterTyped", js.Any.fromFunction2(value))
      
      inline def setOnCharacterTypedUndefined: Self = StObject.set(x, "onCharacterTyped", js.undefined)
      
      inline def setOnLineTyped(value: (/* line */ String, /* lineIndex */ Double) => Unit): Self = StObject.set(x, "onLineTyped", js.Any.fromFunction2(value))
      
      inline def setOnLineTypedUndefined: Self = StObject.set(x, "onLineTyped", js.undefined)
      
      inline def setOnTypingDone(value: () => Unit): Self = StObject.set(x, "onTypingDone", js.Any.fromFunction0(value))
      
      inline def setOnTypingDoneUndefined: Self = StObject.set(x, "onTypingDone", js.undefined)
      
      inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      inline def setStdTypingDelay(value: Double): Self = StObject.set(x, "stdTypingDelay", value.asInstanceOf[js.Any])
      
      inline def setStdTypingDelayUndefined: Self = StObject.set(x, "stdTypingDelay", js.undefined)
    }
  }
}
