package typings.simmerjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.simmerjs.anon.SimmernoConflictany
import typings.std.ArrayLike
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("simmerjs", JSImport.Default)
  @js.native
  val default: SimmerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("simmerjs", JSImport.Default)
  @js.native
  /**
    * @param scope The context in which Simmer should query for elements.
    * Generally speaking this would be the window, which is the default value,
    * but it would be overriden in a situation where you might be using Simmer
    * against a Virtual Dom implementation. If you are using a Virtual DOM, you
    * should provide the Window object of the Virtual DOM
    * @param options Options object allowing you to override the default
    * configuration for Simmer's behaviour.
    * @param query A query engine you wish Simmer to use when evaluating
    * generated selectors. By default Simmer uses the
    * `window.document.querySelectorAll` function and if you provide a window
    * to the scope, Simmer will assume that you want it to use the
    * `document.querySelectorAll` on that window. But if you wish Simmer to use
    * another custom function, such as your own tweaked version of jQuery, you
    * can do so by passing the third argument to the Simmer constructor.
    */
  open class defaultCls ()
    extends StObject
       with Simmer {
    def this(scope: Scope) = this()
    def this(scope: Unit, options: Options) = this()
    def this(scope: Scope, options: Options) = this()
    def this(scope: Unit, options: Unit, query: QueryEngine) = this()
    def this(scope: Unit, options: Options, query: QueryEngine) = this()
    def this(scope: Scope, options: Unit, query: QueryEngine) = this()
    def this(scope: Scope, options: Options, query: QueryEngine) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * How deep into the DOM hierarchy should Simmer go in order to reach a
      * unique selector. This is a delicate game because the higher the number
      * the more likely you are to reach a unique selector, but it also means a
      * longer and more breakable one. Assuming you want to store this selector
      * to use later, making it longer also means it is more likely to change and
      * loose it's validity.
      *
      * @default 3
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * How to handle errors which occur during the analysis
      *
      * Valid Options
      *  - `false`: errors are ignored by Simmer
      *  - `true`: errors rethrown and expected to be caught by the user
      *  - _a function callback will be called with two parameters_: the
      *    exception and the element being analyzed
      */
    var errorHandling: js.UndefOr[Boolean | (js.Function2[/* error */ Any, /* element */ Element, Unit])] = js.undefined
    
    /**
      * A maximum length for the CSS selector can be specified - if no specific
      * selector can be found which is shorter than this length then it is
      * treated as if no selector could be found.
      *
      * @default 520
      */
    var selectorMaxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * A minimum specificty level. Once the parser reaches this level it starts
      * verifying the selector after every method is called. This can cut down
      * our execution time by avoiding needless parsing but can also hurt
      * execution times by performing many verifications. Specificity is
      * calculated based on the W3C spec:
      * http://www.w3.org/TR/css3-selectors/#specificity
      *
      * @default 100
      */
    var specificityThreshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setErrorHandling(value: Boolean | (js.Function2[/* error */ Any, /* element */ Element, Unit])): Self = StObject.set(x, "errorHandling", value.asInstanceOf[js.Any])
      
      inline def setErrorHandlingFunction2(value: (/* error */ Any, /* element */ Element) => Unit): Self = StObject.set(x, "errorHandling", js.Any.fromFunction2(value))
      
      inline def setErrorHandlingUndefined: Self = StObject.set(x, "errorHandling", js.undefined)
      
      inline def setSelectorMaxLength(value: Double): Self = StObject.set(x, "selectorMaxLength", value.asInstanceOf[js.Any])
      
      inline def setSelectorMaxLengthUndefined: Self = StObject.set(x, "selectorMaxLength", js.undefined)
      
      inline def setSpecificityThreshold(value: Double): Self = StObject.set(x, "specificityThreshold", value.asInstanceOf[js.Any])
      
      inline def setSpecificityThresholdUndefined: Self = StObject.set(x, "specificityThreshold", js.undefined)
    }
  }
  
  type QueryEngine = js.Function2[
    /* selector */ String, 
    /* onError */ js.Function1[/* error */ Any, Unit], 
    ArrayLike[Element]
  ]
  
  trait Queryable
    extends StObject
       with Scope {
    
    def querySelectorAll(selector: String, onError: js.Function1[/* error */ Any, Unit]): ArrayLike[Element]
    @JSName("querySelectorAll")
    var querySelectorAll_Original: QueryEngine
  }
  object Queryable {
    
    inline def apply(
      querySelectorAll: (/* selector */ String, /* onError */ js.Function1[/* error */ Any, Unit]) => ArrayLike[Element]
    ): Queryable = {
      val __obj = js.Dynamic.literal(querySelectorAll = js.Any.fromFunction2(querySelectorAll))
      __obj.asInstanceOf[Queryable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Queryable] (val x: Self) extends AnyVal {
      
      inline def setQuerySelectorAll(
        value: (/* selector */ String, /* onError */ js.Function1[/* error */ Any, Unit]) => ArrayLike[Element]
      ): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simmerjs.mod.Queryable
    - typings.simmerjs.mod.WindowLike
  */
  trait Scope extends StObject
  object Scope {
    
    inline def Queryable(
      querySelectorAll: (/* selector */ String, /* onError */ js.Function1[/* error */ Any, Unit]) => ArrayLike[Element]
    ): typings.simmerjs.mod.Queryable = {
      val __obj = js.Dynamic.literal(querySelectorAll = js.Any.fromFunction2(querySelectorAll))
      __obj.asInstanceOf[typings.simmerjs.mod.Queryable]
    }
    
    inline def WindowLike(document: Queryable): typings.simmerjs.mod.WindowLike = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.simmerjs.mod.WindowLike]
    }
  }
  
  @js.native
  trait Simmer extends StObject {
    
    /**
      * Analyze an element and produce a unique CSS selector for it.
      */
    def apply(element: Element): String = js.native
    
    /**
      * If you have an existing instance of Simmer, you can use its configure
      * method to instanciate a new Simmer which has the same scope and
      * configuration as the existing one, with any new configuration you wish to
      * apply.
      */
    def configure(options: Options): Simmer = js.native
  }
  
  @js.native
  trait SimmerConstructor
    extends StObject
       with /**
    * @param scope The context in which Simmer should query for elements.
    * Generally speaking this would be the window, which is the default value,
    * but it would be overriden in a situation where you might be using Simmer
    * against a Virtual Dom implementation. If you are using a Virtual DOM, you
    * should provide the Window object of the Virtual DOM
    * @param options Options object allowing you to override the default
    * configuration for Simmer's behaviour.
    * @param query A query engine you wish Simmer to use when evaluating
    * generated selectors. By default Simmer uses the
    * `window.document.querySelectorAll` function and if you provide a window
    * to the scope, Simmer will assume that you want it to use the
    * `document.querySelectorAll` on that window. But if you wish Simmer to use
    * another custom function, such as your own tweaked version of jQuery, you
    * can do so by passing the third argument to the Simmer constructor.
    */
  Instantiable0[Simmer]
       with Instantiable1[/* scope */ Scope, Simmer]
       with Instantiable2[(/* scope */ Scope) | (/* scope */ Unit), /* options */ Options, Simmer]
       with Instantiable3[
          (/* scope */ Scope) | (/* scope */ Unit), 
          (/* options */ Options) | (/* options */ Unit), 
          /* query */ QueryEngine, 
          Simmer
        ] {
    
    /**
      * @param scope The context in which Simmer should query for elements.
      * Generally speaking this would be the window, which is the default value,
      * but it would be overriden in a situation where you might be using Simmer
      * against a Virtual Dom implementation. If you are using a Virtual DOM, you
      * should provide the Window object of the Virtual DOM
      * @param options Options object allowing you to override the default
      * configuration for Simmer's behaviour.
      * @param query A query engine you wish Simmer to use when evaluating
      * generated selectors. By default Simmer uses the
      * `window.document.querySelectorAll` function and if you provide a window
      * to the scope, Simmer will assume that you want it to use the
      * `document.querySelectorAll` on that window. But if you wish Simmer to use
      * another custom function, such as your own tweaked version of jQuery, you
      * can do so by passing the third argument to the Simmer constructor.
      */
    def apply(): Simmer = js.native
    def apply(scope: Unit, options: Unit, query: QueryEngine): Simmer = js.native
    def apply(scope: Unit, options: Options): Simmer = js.native
    def apply(scope: Unit, options: Options, query: QueryEngine): Simmer = js.native
    def apply(scope: Scope): Simmer = js.native
    def apply(scope: Scope, options: Unit, query: QueryEngine): Simmer = js.native
    def apply(scope: Scope, options: Options): Simmer = js.native
    def apply(scope: Scope, options: Options, query: QueryEngine): Simmer = js.native
  }
  
  trait WindowLike
    extends StObject
       with Scope {
    
    var document: Queryable
  }
  object WindowLike {
    
    inline def apply(document: Queryable): WindowLike = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowLike] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: Queryable): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = SimmerConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: SimmerConstructor = default
  
  object global {
    
    trait Window extends StObject {
      
      /**
        * Analyze an element and produce a unique CSS selector for it.
        */
      /**
        * A global Simmer function will be exposed on the window. This is not the
        * constructor, but rather a default instance which has exposed itself on
        * the window wit ha default configuration. This is not an idea API and is
        * meant to maintain the original API dating back to 2011 when this library
        * was originally written.
        */
      def Simmer(element: Element): String
      /**
        * A global Simmer function will be exposed on the window. This is not the
        * constructor, but rather a default instance which has exposed itself on
        * the window wit ha default configuration. This is not an idea API and is
        * meant to maintain the original API dating back to 2011 when this library
        * was originally written.
        */
      @JSName("Simmer")
      var Simmer_Original: SimmernoConflictany
    }
    object Window {
      
      inline def apply(Simmer: SimmernoConflictany): Window = {
        val __obj = js.Dynamic.literal(Simmer = Simmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setSimmer(value: SimmernoConflictany): Self = StObject.set(x, "Simmer", value.asInstanceOf[js.Any])
      }
    }
  }
}
