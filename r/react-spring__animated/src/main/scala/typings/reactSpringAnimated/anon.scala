package typings.reactSpringAnimated

import typings.reactSpringAnimated.indexCjsMod.WithAnimated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Animated extends StObject {
    
    var animated: WithAnimated = js.native
  }
  object Animated {
    
    @scala.inline
    def apply(animated: WithAnimated): Animated = {
      val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animated]
    }
    
    @scala.inline
    implicit class AnimatedMutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: WithAnimated): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnimatedWithAnimated extends StObject {
    
    var animated: typings.reactSpringAnimated.mod.WithAnimated = js.native
  }
  object AnimatedWithAnimated {
    
    @scala.inline
    def apply(animated: typings.reactSpringAnimated.mod.WithAnimated): AnimatedWithAnimated = {
      val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedWithAnimated]
    }
    
    @scala.inline
    implicit class AnimatedWithAnimatedMutableBuilder[Self <: AnimatedWithAnimated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: typings.reactSpringAnimated.mod.WithAnimated): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-spring/animated.@react-spring/animated/index.cjs.HostConfig> */
  @js.native
  trait PartialHostConfig extends StObject {
    
    var applyAnimatedValues: js.UndefOr[
        js.Function2[
          /* node */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any, 
          Boolean | Unit
        ]
      ] = js.native
    
    var createAnimatedStyle: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* style */ js.Any, 
          typings.reactSpringAnimated.indexCjsMod.Animated[_]
        ]
      ] = js.native
    
    var getComponentProps: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any, 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ _
        ]
      ] = js.native
  }
  object PartialHostConfig {
    
    @scala.inline
    def apply(): PartialHostConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHostConfig]
    }
    
    @scala.inline
    implicit class PartialHostConfigMutableBuilder[Self <: PartialHostConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyAnimatedValues(
        value: (/* node */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any) => Boolean | Unit
      ): Self = StObject.set(x, "applyAnimatedValues", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApplyAnimatedValuesUndefined: Self = StObject.set(x, "applyAnimatedValues", js.undefined)
      
      @scala.inline
      def setCreateAnimatedStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* style */ js.Any => typings.reactSpringAnimated.indexCjsMod.Animated[_]
      ): Self = StObject.set(x, "createAnimatedStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateAnimatedStyleUndefined: Self = StObject.set(x, "createAnimatedStyle", js.undefined)
      
      @scala.inline
      def setGetComponentProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ _
      ): Self = StObject.set(x, "getComponentProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetComponentPropsUndefined: Self = StObject.set(x, "getComponentProps", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@react-spring/animated.@react-spring/animated.HostConfig> */
  @js.native
  trait PartialHostConfigApplyAnimatedValues extends StObject {
    
    var applyAnimatedValues: js.UndefOr[
        js.Function2[
          /* node */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any, 
          Boolean | Unit
        ]
      ] = js.native
    
    var createAnimatedStyle: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* style */ js.Any, 
          typings.reactSpringAnimated.mod.Animated[_]
        ]
      ] = js.native
    
    var getComponentProps: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any, 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ _
        ]
      ] = js.native
  }
  object PartialHostConfigApplyAnimatedValues {
    
    @scala.inline
    def apply(): PartialHostConfigApplyAnimatedValues = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHostConfigApplyAnimatedValues]
    }
    
    @scala.inline
    implicit class PartialHostConfigApplyAnimatedValuesMutableBuilder[Self <: PartialHostConfigApplyAnimatedValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyAnimatedValues(
        value: (/* node */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any) => Boolean | Unit
      ): Self = StObject.set(x, "applyAnimatedValues", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApplyAnimatedValuesUndefined: Self = StObject.set(x, "applyAnimatedValues", js.undefined)
      
      @scala.inline
      def setCreateAnimatedStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* style */ js.Any => typings.reactSpringAnimated.mod.Animated[_]
      ): Self = StObject.set(x, "createAnimatedStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateAnimatedStyleUndefined: Self = StObject.set(x, "createAnimatedStyle", js.undefined)
      
      @scala.inline
      def setGetComponentProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Lookup */ /* props */ js.Any => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ _
      ): Self = StObject.set(x, "getComponentProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetComponentPropsUndefined: Self = StObject.set(x, "getComponentProps", js.undefined)
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: js.UndefOr[js.Any] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
