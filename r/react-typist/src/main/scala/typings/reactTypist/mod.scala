package typings.reactTypist

import typings.react.mod.Component
import typings.reactTypist.mod.Typist.BackSpaceProps
import typings.reactTypist.mod.Typist.CurrentTextProps
import typings.reactTypist.mod.Typist.CursorProps
import typings.reactTypist.mod.Typist.DelayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-typist", JSImport.Default)
  @js.native
  class default protected () extends Typist {
    def this(props: TypistProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TypistProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("react-typist", "default.Backspace")
    @js.native
    class Backspace protected ()
      extends typings.reactTypist.mod.Typist.Backspace {
      def this(props: BackSpaceProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: BackSpaceProps, context: js.Any) = this()
    }
    
    @JSImport("react-typist", "default.Delay")
    @js.native
    class Delay protected ()
      extends typings.reactTypist.mod.Typist.Delay {
      def this(props: DelayProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DelayProps, context: js.Any) = this()
    }
  }
  
  @JSImport("react-typist", "Typist")
  @js.native
  class Typist protected ()
    extends Component[TypistProps, js.Object, js.Any] {
    def this(props: TypistProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TypistProps, context: js.Any) = this()
  }
  object Typist {
    
    @JSImport("react-typist", "Typist.Backspace")
    @js.native
    class Backspace protected ()
      extends Component[BackSpaceProps, js.Object, js.Any] {
      def this(props: BackSpaceProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: BackSpaceProps, context: js.Any) = this()
    }
    
    @JSImport("react-typist", "Typist.Delay")
    @js.native
    class Delay protected ()
      extends Component[DelayProps, js.Object, js.Any] {
      def this(props: DelayProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: DelayProps, context: js.Any) = this()
    }
    
    @js.native
    trait BackSpaceProps extends StObject {
      
      var count: js.UndefOr[Double] = js.native
      
      var delay: js.UndefOr[Double] = js.native
    }
    object BackSpaceProps {
      
      @scala.inline
      def apply(): BackSpaceProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BackSpaceProps]
      }
      
      @scala.inline
      implicit class BackSpacePropsMutableBuilder[Self <: BackSpaceProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      }
    }
    
    @js.native
    trait CurrentTextProps extends StObject {
      
      var charIdx: Double = js.native
      
      var character: String = js.native
      
      def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ js.Any, Double] = js.native
      
      var line: String = js.native
      
      var lineIdx: Double = js.native
    }
    object CurrentTextProps {
      
      @scala.inline
      def apply(
        charIdx: Double,
        character: String,
        defDelayGenerator: (Double, Double) => js.Function1[/* params */ js.Any, Double],
        line: String,
        lineIdx: Double
      ): CurrentTextProps = {
        val __obj = js.Dynamic.literal(charIdx = charIdx.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], defDelayGenerator = js.Any.fromFunction2(defDelayGenerator), line = line.asInstanceOf[js.Any], lineIdx = lineIdx.asInstanceOf[js.Any])
        __obj.asInstanceOf[CurrentTextProps]
      }
      
      @scala.inline
      implicit class CurrentTextPropsMutableBuilder[Self <: CurrentTextProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCharIdx(value: Double): Self = StObject.set(x, "charIdx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefDelayGenerator(value: (Double, Double) => js.Function1[/* params */ js.Any, Double]): Self = StObject.set(x, "defDelayGenerator", js.Any.fromFunction2(value))
        
        @scala.inline
        def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLineIdx(value: Double): Self = StObject.set(x, "lineIdx", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait CursorProps extends StObject {
      
      var blink: js.UndefOr[Boolean] = js.native
      
      var element: js.UndefOr[String] = js.native
      
      var hideWhenDone: js.UndefOr[Boolean] = js.native
      
      var hideWhenDoneDelay: js.UndefOr[Double] = js.native
      
      var show: js.UndefOr[Boolean] = js.native
    }
    object CursorProps {
      
      @scala.inline
      def apply(): CursorProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CursorProps]
      }
      
      @scala.inline
      implicit class CursorPropsMutableBuilder[Self <: CursorProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlink(value: Boolean): Self = StObject.set(x, "blink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlinkUndefined: Self = StObject.set(x, "blink", js.undefined)
        
        @scala.inline
        def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
        
        @scala.inline
        def setHideWhenDone(value: Boolean): Self = StObject.set(x, "hideWhenDone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideWhenDoneDelay(value: Double): Self = StObject.set(x, "hideWhenDoneDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideWhenDoneDelayUndefined: Self = StObject.set(x, "hideWhenDoneDelay", js.undefined)
        
        @scala.inline
        def setHideWhenDoneUndefined: Self = StObject.set(x, "hideWhenDone", js.undefined)
        
        @scala.inline
        def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      }
    }
    
    @js.native
    trait DelayProps extends StObject {
      
      var ms: Double = js.native
    }
    object DelayProps {
      
      @scala.inline
      def apply(ms: Double): DelayProps = {
        val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DelayProps]
      }
      
      @scala.inline
      implicit class DelayPropsMutableBuilder[Self <: DelayProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait TypistProps extends StObject {
    
    var avgTypingDelay: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var cursor: js.UndefOr[CursorProps] = js.native
    
    var delayGenerator: js.UndefOr[
        js.Function3[/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps, Double]
      ] = js.native
    
    var onCharacterTyped: js.UndefOr[js.Function2[/* char */ String, /* charIndex */ Double, Unit]] = js.native
    
    var onLineTyped: js.UndefOr[js.Function2[/* line */ String, /* lineIndex */ Double, Unit]] = js.native
    
    var onTypingDone: js.UndefOr[js.Function0[Unit]] = js.native
    
    var startDelay: js.UndefOr[Double] = js.native
    
    var stdTypingDelay: js.UndefOr[Double] = js.native
  }
  object TypistProps {
    
    @scala.inline
    def apply(): TypistProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypistProps]
    }
    
    @scala.inline
    implicit class TypistPropsMutableBuilder[Self <: TypistProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvgTypingDelay(value: Double): Self = StObject.set(x, "avgTypingDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvgTypingDelayUndefined: Self = StObject.set(x, "avgTypingDelay", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCursor(value: CursorProps): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDelayGenerator(value: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double): Self = StObject.set(x, "delayGenerator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDelayGeneratorUndefined: Self = StObject.set(x, "delayGenerator", js.undefined)
      
      @scala.inline
      def setOnCharacterTyped(value: (/* char */ String, /* charIndex */ Double) => Unit): Self = StObject.set(x, "onCharacterTyped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCharacterTypedUndefined: Self = StObject.set(x, "onCharacterTyped", js.undefined)
      
      @scala.inline
      def setOnLineTyped(value: (/* line */ String, /* lineIndex */ Double) => Unit): Self = StObject.set(x, "onLineTyped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLineTypedUndefined: Self = StObject.set(x, "onLineTyped", js.undefined)
      
      @scala.inline
      def setOnTypingDone(value: () => Unit): Self = StObject.set(x, "onTypingDone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTypingDoneUndefined: Self = StObject.set(x, "onTypingDone", js.undefined)
      
      @scala.inline
      def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
      
      @scala.inline
      def setStdTypingDelay(value: Double): Self = StObject.set(x, "stdTypingDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdTypingDelayUndefined: Self = StObject.set(x, "stdTypingDelay", js.undefined)
    }
  }
}
