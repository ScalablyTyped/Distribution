package typings.reactWithStyles

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactWithStyles.anon.CSSPropertiespseudoSelect
import typings.reactWithStyles.reactWithStylesStrings.css
import typings.reactWithStyles.reactWithStylesStrings.styles
import typings.reactWithStyles.reactWithStylesStrings.theme
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-with-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def css(styles: js.Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def withStyles[T](): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")().asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ]]
  @scala.inline
  def withStyles[T](styleFn: js.Function1[/* theme */ T, Styles]): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(styleFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ]]
  @scala.inline
  def withStyles[T](styleFn: js.Function1[/* theme */ T, Styles], options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(styleFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ]]
  @scala.inline
  def withStyles[T](styleFn: Null, options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(styleFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ]]
  @scala.inline
  def withStyles[T](styleFn: Unit, options: WithStylesOptions): js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(styleFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Any], 
    ComponentClass[
      Omit[
        ElementConfig[ComponentType[js.Any]], 
        /* keyof react-with-styles.react-with-styles.WithStylesProps<T> */ css | styles | theme
      ], 
      ComponentState
    ]
  ]]
  
  /* Inlined prop-types.prop-types.ValidationMap<react-with-styles.react-with-styles.WithStylesProps<react-with-styles.react-with-styles.Theme>> */
  object withStylesPropTypes {
    
    @JSImport("react-with-styles", "withStylesPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-with-styles", "withStylesPropTypes.css")
    @js.native
    def css: js.UndefOr[Validator[js.Function1[/* repeated */ js.Any, js.Object]]] = js.native
    @scala.inline
    def css_=(x: js.UndefOr[Validator[js.Function1[/* repeated */ js.Any, js.Object]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
    
    @JSImport("react-with-styles", "withStylesPropTypes.styles")
    @js.native
    def styles: js.UndefOr[Validator[StringDictionary[js.Object]]] = js.native
    @scala.inline
    def styles_=(x: js.UndefOr[Validator[StringDictionary[js.Object]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    @JSImport("react-with-styles", "withStylesPropTypes.theme")
    @js.native
    def theme: js.UndefOr[Validator[Theme]] = js.native
    @scala.inline
    def theme_=(x: js.UndefOr[Validator[Theme]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  }
  
  type ComponentClassProps[C] = js.Any
  
  type ElementConfig[C] = LibraryManagedAttributes[C, ElementProps[C]]
  
  type ElementProps[C] = SFCProps[C] | ComponentClassProps[C]
  
  type Nullable[T] = js.UndefOr[T | Null]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type SFCProps[C] = js.Any
  
  type Styles = StringDictionary[Nullable[CSSPropertiespseudoSelect]]
  
  // tslint:disable-next-line no-empty-interface
  trait Theme extends StObject
  
  trait WithStylesOptions extends StObject {
    
    var flushBefore: js.UndefOr[Boolean] = js.undefined
    
    var pureComponent: js.UndefOr[Boolean] = js.undefined
  }
  object WithStylesOptions {
    
    @scala.inline
    def apply(): WithStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions]
    }
    
    @scala.inline
    implicit class WithStylesOptionsMutableBuilder[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlushBefore(value: Boolean): Self = StObject.set(x, "flushBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushBeforeUndefined: Self = StObject.set(x, "flushBefore", js.undefined)
      
      @scala.inline
      def setPureComponent(value: Boolean): Self = StObject.set(x, "pureComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureComponentUndefined: Self = StObject.set(x, "pureComponent", js.undefined)
    }
  }
  
  trait WithStylesProps[T] extends StObject {
    
    /**
      * This function takes styles that were processed by `withStyles()`, plain objects, or arrays
      * of these things. It returns an object with an opaque structure that must be spread into a
      * JSX element.
      */
    def css(styles: js.Any*): js.Object
    
    var styles: StringDictionary[js.Object]
    
    var theme: T
  }
  object WithStylesProps {
    
    @scala.inline
    def apply[T](css: /* repeated */ js.Any => js.Object, styles: StringDictionary[js.Object], theme: T): WithStylesProps[T] = {
      val __obj = js.Dynamic.literal(css = js.Any.fromFunction1(css), styles = styles.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithStylesProps[T]]
    }
    
    @scala.inline
    implicit class WithStylesPropsMutableBuilder[Self <: WithStylesProps[?], T] (val x: Self & WithStylesProps[T]) extends AnyVal {
      
      @scala.inline
      def setCss(value: /* repeated */ js.Any => js.Object): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyles(value: StringDictionary[js.Object]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
