package typings.sandboxedModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sandboxed-module", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with SandboxedModule {
    
    /**
      * A getter returning the sandboxedModule.module.exports object.
      */
    /* CompleteClass */
    var exports: js.Any = js.native
    
    /**
      * The full path to the module.
      */
    /* CompleteClass */
    var filename: String = js.native
    
    /**
      * See {@link SandboxOptions.globals}
      */
    /* CompleteClass */
    var globals: js.Object = js.native
    
    /**
      * See {@link SandboxOptions.locals}
      */
    /* CompleteClass */
    var locals: js.Object = js.native
    
    /**
      * The underlaying node.js Module instance.
      */
    /* CompleteClass */
    var module: String = js.native
    
    /**
      * See {@link SandboxOptions.requires}
      */
    /* CompleteClass */
    var required: js.Object = js.native
    
    /**
      * See {@link SandboxOptions.sourceTransformers}.
      */
    /* CompleteClass */
    var sourceTransformers: js.Object = js.native
  }
  @JSImport("sandboxed-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sets options globally across all uses of {@link SandboxedModule.load()} and {@link SandboxedModule.require()}.
    * This way, a commonly needed require, global, local, or sourceTransformer can be specified once across all
    * sandboxed modules.
    * @param options the loading and requiring default options
    */
  /* static member */
  @scala.inline
  def configure(options: SandboxOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns a new SandboxedModule where moduleId is a regular module path / id as you would normally pass into
    * require(). The new module will be loaded in its own v8 context, but otherwise have access to the normal
    * node.js environment.
    *
    * @param moduleId the ID of the module to load
    * @param options the loading options
    */
  /* static member */
  @scala.inline
  def load(moduleId: String): SandboxedModule = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(moduleId.asInstanceOf[js.Any]).asInstanceOf[SandboxedModule]
  @scala.inline
  def load(moduleId: String, options: SandboxOptions): SandboxedModule = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(moduleId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SandboxedModule]
  
  /**
    * Enables a built-in source transformer by name. Currently, SandboxedModule ships with two built in source
    * transformers:
    *  * "coffee" - Compiles source with CoffeeScript [Enabled by default for backwards compatibility].
    *    Be sure to run require('coffee-script').register() or require('coffee-script/register') as well.
    *  * "istanbul" - Instruments sources via istanbul when istanbul code coverage is running.
    *    For example, if you'd like to use SandboxedModule in conjunction with istanbul, just run
    *    SandboxedModule.registerBuiltInSourceTransformer('istanbul').
    * @param name The name of the built-in source transformer
    */
  /* static member */
  @scala.inline
  def registerBuiltInSourceTransformer(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuiltInSourceTransformer")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Identical to {@link SandboxedModule.load()}, but returns sandboxedModule.exports directly.
    *
    * @param moduleId the ID of the module to require
    * @param options the requiring options
    */
  /* static member */
  @scala.inline
  def require(moduleId: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def require(moduleId: String, options: SandboxOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(moduleId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait SandboxOptions extends StObject {
    
    /**
      * An object of global variables to inject into the sandboxed module.
      */
    var globals: js.UndefOr[js.Object] = js.undefined
    
    /**
      * An object of local variables to inject into the sandboxed module.
      */
    var locals: js.UndefOr[js.Object] = js.undefined
    
    /**
      * An object containing moduleIds and the values to inject for them when required by the sandboxed module.
      * This does not affect children of the sandboxed module.
      */
    var requires: js.UndefOr[js.Object] = js.undefined
    
    /**
      * If false, modules that are required by the sandboxed module will not be sandboxed. By default all modules
      * required by the sandboxedModule will be sandboxed using the same options that were used for the original
      * sandboxed module.
      */
    var singleOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object of named functions which will transform the source code required with SandboxedModule.require.
      * For example, CoffeeScript & istanbul support is implemented with built-in sourceTransformer functions
      * (see #registerBuiltInSourceTransformer).
      *
      * A source transformer receives the source (as it's been transformed thus far) and must return the transformed
      * source (whether it's changed or unchanged).
      *
      * An example source transformer to change all instances of the number "3" to "5" would look like this:
      *
      * SandboxedModule.require('../fixture/baz', {
      *   sourceTransformers: {
      *     turn3sInto5s: function(source) {
      *       return source.replace(/3/g,'5');
      *     }
      *   }
      * })
      */
    var sourceTransformers: js.UndefOr[js.Object] = js.undefined
    
    /**
      * If false, the source transformers will not be run against modules required by the sandboxed module.
      * By default it will take the same value as {@link SandboxOptions.singleOnly}.
      */
    var sourceTransformersSingleOnly: js.UndefOr[Boolean] = js.undefined
  }
  object SandboxOptions {
    
    @scala.inline
    def apply(): SandboxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SandboxOptions]
    }
    
    @scala.inline
    implicit class SandboxOptionsMutableBuilder[Self <: SandboxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobals(value: js.Object): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setRequires(value: js.Object): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      @scala.inline
      def setSingleOnly(value: Boolean): Self = StObject.set(x, "singleOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleOnlyUndefined: Self = StObject.set(x, "singleOnly", js.undefined)
      
      @scala.inline
      def setSourceTransformers(value: js.Object): Self = StObject.set(x, "sourceTransformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTransformersSingleOnly(value: Boolean): Self = StObject.set(x, "sourceTransformersSingleOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTransformersSingleOnlyUndefined: Self = StObject.set(x, "sourceTransformersSingleOnly", js.undefined)
      
      @scala.inline
      def setSourceTransformersUndefined: Self = StObject.set(x, "sourceTransformers", js.undefined)
    }
  }
  
  trait SandboxedModule extends StObject {
    
    /**
      * A getter returning the sandboxedModule.module.exports object.
      */
    var exports: js.Any
    
    /**
      * The full path to the module.
      */
    var filename: String
    
    /**
      * See {@link SandboxOptions.globals}
      */
    var globals: js.Object
    
    /**
      * See {@link SandboxOptions.locals}
      */
    var locals: js.Object
    
    /**
      * The underlaying node.js Module instance.
      */
    var module: String
    
    /**
      * See {@link SandboxOptions.requires}
      */
    var required: js.Object
    
    /**
      * See {@link SandboxOptions.sourceTransformers}.
      */
    var sourceTransformers: js.Object
  }
  object SandboxedModule {
    
    @scala.inline
    def apply(
      exports: js.Any,
      filename: String,
      globals: js.Object,
      locals: js.Object,
      module: String,
      required: js.Object,
      sourceTransformers: js.Object
    ): SandboxedModule = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], locals = locals.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], sourceTransformers = sourceTransformers.asInstanceOf[js.Any])
      __obj.asInstanceOf[SandboxedModule]
    }
    
    @scala.inline
    implicit class SandboxedModuleMutableBuilder[Self <: SandboxedModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobals(value: js.Object): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: js.Object): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTransformers(value: js.Object): Self = StObject.set(x, "sourceTransformers", value.asInstanceOf[js.Any])
    }
  }
}
