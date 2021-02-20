package typings.ractive

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.ractive.mod.Adaptor
import typings.ractive.mod.Component
import typings.ractive.mod.Constructor
import typings.ractive.mod.ContextHelper
import typings.ractive.mod.CssFn
import typings.ractive.mod.Decorator
import typings.ractive.mod.Easing
import typings.ractive.mod.EventPlugin
import typings.ractive.mod.ExtendOpts
import typings.ractive.mod.Helper
import typings.ractive.mod.InitOpts
import typings.ractive.mod.Interpolator
import typings.ractive.mod.Macro
import typings.ractive.mod.MacroFn
import typings.ractive.mod.MacroOpts
import typings.ractive.mod.ParseOpts
import typings.ractive.mod.ParsedTemplate
import typings.ractive.mod.Partial
import typings.ractive.mod.PluginExtend
import typings.ractive.mod.Ractive
import typings.ractive.mod.Registries
import typings.ractive.mod.Registry
import typings.ractive.mod.Static
import typings.ractive.mod.ValueMap
import typings.ractive.ractiveStrings.fast
import typings.ractive.ractiveStrings.slow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends Instantiable0[
          Ractive[Ractive[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]]
        ]
       with Instantiable1[
          /* opts */ InitOpts[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Ractive[Ractive[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]]
        ] {
    
    /** When true, causes Ractive to emit warnings. Defaults to true. */
    var DEBUG: Boolean = js.native
    
    var DEBUG_PROMISES: Boolean = js.native
    
    /** The parent constructor used to create this constructor. */
    var Parent: Static[Ractive[Ractive[_]]] = js.native
    
    val VERSION: String = js.native
    
    var adaptors: Registry[Adaptor] = js.native
    
    /**
    	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
    	 * as opposed scoped CSS installed on a component constructor.
    	 */
    def addCSS(id: String, css: String): Unit = js.native
    def addCSS(id: String, css: CssFn): Unit = js.native
    
    var components: Registry[Component] = js.native
    
    var decorators: Registry[Decorator[Ractive[Ractive[_]]]] = js.native
    
    /** The registries that are inherited by all instance. */
    var defaults: Registries[Ractive[Ractive[_]]] = js.native
    
    var easings: Registry[Easing] = js.native
    
    /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
    def escapeKey(key: String): String = js.native
    
    var events: Registry[EventPlugin[Ractive[Ractive[_]]]] = js.native
    
    /** Create a new component with this constructor as a starting point. */
    def extend[U](): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
    def extend[U](opts: ExtendOpts[Ractive[Ractive[_]] with U]): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
    
    /** Create a new component with this constuuctor as a starting point using the given constructor. */
    def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
    def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[Ractive[Ractive[_]] with U]] = js.native
    
    /** Retrieve the CSS string for all loaded components. */
    def getCSS(): String = js.native
    
    def getContext(nodeOrQuery: String): ContextHelper = js.native
    /** Get a Context for the given node or selector. */
    def getContext(nodeOrQuery: HTMLElement): ContextHelper = js.native
    
    /** Check to see if CSS with the given id has already been added */
    def hasCSS(id: String): Boolean = js.native
    
    var helpers: Registry[Helper] = js.native
    
    var interpolators: Registry[Interpolator] = js.native
    
    /** @returns true if the given object is an instance of this constructor */
    def isInstance(obj: js.Any): Boolean = js.native
    
    /** Safely join the given keys into a keypath. */
    def joinKeys(keys: String*): String = js.native
    
    /**
    	 * Initialize a macro function.
    	 * @param macro
    	 * @param options
    	 */
    def `macro`(`macro`: MacroFn): Macro = js.native
    def `macro`(`macro`: MacroFn, options: MacroOpts): Macro = js.native
    
    /**
    	 * Parse the given template string into a template.j
    	 */
    def parse(template: String): ParsedTemplate = js.native
    def parse(template: String, opts: ParseOpts): ParsedTemplate = js.native
    
    var partials: Registry[Partial] = js.native
    
    /** Get the value at the given keypath from the Ractive shared store. */
    def sharedGet(keypath: String): js.Any = js.native
    
    /** Set the given keypath in the Ractive shared store to the given value. */
    def sharedSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
    /** Set the given map of values in the Ractive shared store. */
    def sharedSet(map: ValueMap): js.Promise[Unit] = js.native
    
    /** Split the given keypath into its constituent keys. */
    def splitKeypath(keypath: String): js.Array[String] = js.native
    
    /** Get the css data for this constructor at the given keypath. */
    def styleGet(keypath: String): js.Any = js.native
    
    /** Set the css data for this constructor at the given keypath to the given value. */
    def styleSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
    /** Set the given map of values in the css data for this constructor. */
    def styleSet(map: ValueMap): js.Promise[Unit] = js.native
    
    /** true if Ractive detects that this environment supports svg. */
    val svg: Boolean = js.native
    
    /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
    def unescapeKey(key: String): String = js.native
    
    def use(args: PluginExtend*): Static[Ractive[Ractive[_]]] = js.native
  }
  
  @js.native
  trait Optional extends StObject {
    
    var optional: js.UndefOr[js.Array[String]] = js.native
    
    var required: js.UndefOr[js.Array[String]] = js.native
  }
  object Optional {
    
    @scala.inline
    def apply(): Optional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optional]
    }
    
    @scala.inline
    implicit class OptionalMutableBuilder[Self <: Optional] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptional(value: js.Array[String]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setOptionalVarargs(value: String*): Self = StObject.set(x, "optional", js.Array(value :_*))
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Teardown extends StObject {
    
    def teardown(): Unit = js.native
  }
  object Teardown {
    
    @scala.inline
    def apply(teardown: () => Unit): Teardown = {
      val __obj = js.Dynamic.literal(teardown = js.Any.fromFunction0(teardown))
      __obj.asInstanceOf[Teardown]
    }
    
    @scala.inline
    implicit class TeardownMutableBuilder[Self <: Teardown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined ractive.ractive.TransitionOpts & {} */
  @js.native
  trait TransitionOpts extends StObject {
    
    /** The delay in milliseconds to wait before triggering the transition. */
    var delay: js.UndefOr[Double] = js.native
    
    /** The duration for the transition in milliseconds, slow for 600ms, fast for 200ms, and any other string for 400ms. */
    var duration: js.UndefOr[Double | slow | fast | String] = js.native
    
    /** The easing to use for the transition. */
    var easing: js.UndefOr[String] = js.native
  }
  object TransitionOpts {
    
    @scala.inline
    def apply(): TransitionOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOpts]
    }
    
    @scala.inline
    implicit class TransitionOptsMutableBuilder[Self <: TransitionOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | slow | fast | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
