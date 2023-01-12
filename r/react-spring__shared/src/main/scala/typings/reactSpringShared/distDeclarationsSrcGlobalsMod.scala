package typings.reactSpringShared

import org.scalablytyped.runtime.StringDictionary
import typings.reactSpringShared.anon.FnCall
import typings.reactSpringShared.distDeclarationsSrcFluidsMod.FluidValue
import typings.reactSpringShared.distDeclarationsSrcFrameLoopMod.OpaqueAnimation
import typings.reactSpringTypes.interpolationMod.InterpolatorArgs
import typings.reactSpringTypes.interpolationMod.InterpolatorConfig
import typings.reactSpringTypes.utilMod.OneOrMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcGlobalsMod {
  
  @JSImport("@react-spring/shared/dist/declarations/src/globals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(globals: AnimatedGlobals): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(globals.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@react-spring/shared/dist/declarations/src/globals", "colors")
  @js.native
  def colors: StringDictionary[Double] | Null = js.native
  inline def colors_=(x: StringDictionary[Double] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/dist/declarations/src/globals", "createStringInterpolator")
  @js.native
  def createStringInterpolator: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]] = js.native
  inline def createStringInterpolator_=(x: js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createStringInterpolator")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/dist/declarations/src/globals", "skipAnimation")
  @js.native
  def skipAnimation: Boolean = js.native
  inline def skipAnimation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipAnimation")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/dist/declarations/src/globals", "to")
  @js.native
  def to: js.Function2[
    /* source */ OneOrMore[FluidValue[Any, Any]], 
    /* args */ InterpolatorArgs[Any, Any], 
    FluidValue[Any, Any]
  ] = js.native
  inline def to_=(
    x: js.Function2[
      /* source */ OneOrMore[FluidValue[Any, Any]], 
      /* args */ InterpolatorArgs[Any, Any], 
      FluidValue[Any, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("to")(x.asInstanceOf[js.Any])
  
  @JSImport("@react-spring/shared/dist/declarations/src/globals", "willAdvance")
  @js.native
  def willAdvance: js.Function1[/* animation */ OpaqueAnimation, Unit] = js.native
  inline def willAdvance_=(x: js.Function1[/* animation */ OpaqueAnimation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("willAdvance")(x.asInstanceOf[js.Any])
  
  trait AnimatedGlobals extends StObject {
    
    /** Event props are called with `batchedUpdates` to reduce extraneous renders */
    var batchedUpdates: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof raf.batchedUpdates */ Any
      ] = js.undefined
    
    /** Provide custom color names for interpolation */
    var colors: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
    
    /** Provide custom logic for string interpolation */
    var createStringInterpolator: js.UndefOr[
        js.Function1[/* config */ InterpolatorConfig[String], js.Function1[/* input */ Double, String]]
      ] = js.undefined
    
    /** sets the global frameLoop setting for the global raf instance */
    var frameLoop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rafz * / any['frameLoop'] */ js.Any
      ] = js.undefined
    
    /** Used to measure frame length. Read more [here](https://developer.mozilla.org/en-US/docs/Web/API/Performance/now) */
    var now: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof raf.now */ Any
      ] = js.undefined
    
    /** Schedule a function to run on the next frame */
    var requestAnimationFrame: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
    
    /** Make all animations instant and skip the frameloop entirely */
    var skipAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Returns a new `Interpolation` object */
    var to: js.UndefOr[FnCall] = js.undefined
    
    /** @internal Exposed for testing purposes */
    var willAdvance: js.UndefOr[js.Function1[/* animation */ OpaqueAnimation, Unit]] = js.undefined
  }
  object AnimatedGlobals {
    
    inline def apply(): AnimatedGlobals = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedGlobals]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimatedGlobals] (val x: Self) extends AnyVal {
      
      inline def setBatchedUpdates(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof raf.batchedUpdates */ Any
      ): Self = StObject.set(x, "batchedUpdates", value.asInstanceOf[js.Any])
      
      inline def setBatchedUpdatesUndefined: Self = StObject.set(x, "batchedUpdates", js.undefined)
      
      inline def setColors(value: StringDictionary[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsNull: Self = StObject.set(x, "colors", null)
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCreateStringInterpolator(value: /* config */ InterpolatorConfig[String] => js.Function1[/* input */ Double, String]): Self = StObject.set(x, "createStringInterpolator", js.Any.fromFunction1(value))
      
      inline def setCreateStringInterpolatorUndefined: Self = StObject.set(x, "createStringInterpolator", js.undefined)
      
      inline def setFrameLoop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rafz * / any['frameLoop'] */ js.Any
      ): Self = StObject.set(x, "frameLoop", value.asInstanceOf[js.Any])
      
      inline def setFrameLoopUndefined: Self = StObject.set(x, "frameLoop", js.undefined)
      
      inline def setNow(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof raf.now */ Any): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setRequestAnimationFrame(value: /* cb */ js.Function0[Unit] => Unit): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
      
      inline def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
      
      inline def setSkipAnimation(value: Boolean): Self = StObject.set(x, "skipAnimation", value.asInstanceOf[js.Any])
      
      inline def setSkipAnimationUndefined: Self = StObject.set(x, "skipAnimation", js.undefined)
      
      inline def setTo(value: FnCall): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setWillAdvance(value: /* animation */ OpaqueAnimation => Unit): Self = StObject.set(x, "willAdvance", js.Any.fromFunction1(value))
      
      inline def setWillAdvanceUndefined: Self = StObject.set(x, "willAdvance", js.undefined)
    }
  }
}
