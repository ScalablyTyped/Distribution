package typings.storybookAddonJest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Context
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Pick
import typings.storybookAddonJest.distTs3Dot9HocProvideJestResultMod.AssertionResult
import typings.storybookAddonJest.distTs3Dot9HocProvideJestResultMod.HocProps
import typings.storybookAddonJest.distTs3Dot9HocProvideJestResultMod.HocState
import typings.storybookAddonJest.distTs3Dot9HocProvideJestResultMod.Test
import typings.storybookAddonJest.storybookAddonJestBooleans.`true`
import typings.storybookAddonJest.storybookAddonJestStrings.kind
import typings.storybookAddonJest.storybookAddonJestStrings.storyName
import typings.storybookAddonJest.storybookAddonJestStrings.tests
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: Boolean
  }
  object Active {
    
    inline def apply(active: Boolean): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssertionResults extends StObject {
    
    var assertionResults: js.Array[AssertionResult]
    
    var status: String
  }
  object AssertionResults {
    
    inline def apply(assertionResults: js.Array[AssertionResult], status: String): AssertionResults = {
      val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssertionResults] (val x: Self) extends AnyVal {
      
      inline def setAssertionResults(value: js.Array[AssertionResult]): Self = StObject.set(x, "assertionResults", value.asInstanceOf[js.Any])
      
      inline def setAssertionResultsVarargs(value: AssertionResult*): Self = StObject.set(x, "assertionResults", js.Array(value*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentDidCatch extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyHocProps, /* nextContext */ Any, Unit]] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyHocProps, 
          /* nextState */ ReadonlyHocState, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    def componentDidMount(): Unit = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ ReadonlyHocProps, 
          /* prevState */ ReadonlyHocState, 
          /* snapshot */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ ReadonlyHocProps, /* nextContext */ Any, Unit]] = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyHocProps, 
          /* nextState */ ReadonlyHocState, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[/* prevProps */ ReadonlyHocProps, /* prevState */ ReadonlyHocState, Any]
      ] = js.native
    
    var mounted: Boolean = js.native
    
    def onAddTests(param0: HocState): Unit = js.native
    
    val props: ReadonlyHocPropsReadonlyc = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def setState[K /* <: storyName | kind | tests */](state: HocState | (Pick[HocState, K])): Unit = js.native
    def setState[K /* <: storyName | kind | tests */](state: HocState | (Pick[HocState, K]), callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: storyName | kind | tests */](
      state: js.Function2[
          /* prevState */ ReadonlyHocState, 
          /* props */ ReadonlyHocProps, 
          HocState | (Pick[HocState, K])
        ]
    ): Unit = js.native
    def setState[K /* <: storyName | kind | tests */](
      state: js.Function2[
          /* prevState */ ReadonlyHocState, 
          /* props */ ReadonlyHocProps, 
          HocState | (Pick[HocState, K])
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ ReadonlyHocProps, 
          /* nextState */ ReadonlyHocState, 
          /* nextContext */ Any, 
          Boolean
        ]
      ] = js.native
    
    var state: HocState = js.native
    
    def stopListeningOnStory(): Unit = js.native
  }
  
  trait Disabled extends StObject {
    
    var disabled: `true`
  }
  object Disabled {
    
    inline def apply(): Disabled = {
      val __obj = js.Dynamic.literal(disabled = true)
      __obj.asInstanceOf[Disabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: `true`): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilesExt extends StObject {
    
    var filesExt: js.UndefOr[String] = js.undefined
    
    var results: Any
  }
  object FilesExt {
    
    inline def apply(results: Any): FilesExt = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilesExt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilesExt] (val x: Self) extends AnyVal {
      
      inline def setFilesExt(value: String): Self = StObject.set(x, "filesExt", value.asInstanceOf[js.Any])
      
      inline def setFilesExtUndefined: Self = StObject.set(x, "filesExt", js.undefined)
      
      inline def setResults(value: Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[(/* props */ HocProps) | (/* props */ ReadonlyHocProps), ComponentDidCatch]
       with Instantiable2[/* props */ HocProps, /* context */ Any, ComponentDidCatch] {
    
    var contextType: js.UndefOr[Context[Any]] = js.native
    
    var defaultProps: Active = js.native
  }
  
  /* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/ts3.9/hoc/provideJestResult.HocProps> */
  trait ReadonlyHocProps extends StObject {
    
    val active: js.UndefOr[Boolean] = js.undefined
    
    val api: API
  }
  object ReadonlyHocProps {
    
    inline def apply(api: API): ReadonlyHocProps = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyHocProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyHocProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/ts3.9/hoc/provideJestResult.HocProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
  trait ReadonlyHocPropsReadonlyc extends StObject {
    
    val active: js.UndefOr[Boolean] = js.undefined
    
    val api: API
    
    val children: js.UndefOr[ReactNode] = js.undefined
  }
  object ReadonlyHocPropsReadonlyc {
    
    inline def apply(api: API): ReadonlyHocPropsReadonlyc = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyHocPropsReadonlyc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyHocPropsReadonlyc] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/ts3.9/hoc/provideJestResult.HocState> */
  trait ReadonlyHocState extends StObject {
    
    val kind: js.UndefOr[String] = js.undefined
    
    val storyName: js.UndefOr[String] = js.undefined
    
    val tests: js.UndefOr[js.Array[Test]] = js.undefined
  }
  object ReadonlyHocState {
    
    inline def apply(): ReadonlyHocState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHocState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyHocState] (val x: Self) extends AnyVal {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setStoryName(value: String): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
      
      inline def setStoryNameUndefined: Self = StObject.set(x, "storyName", js.undefined)
      
      inline def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
    }
  }
}
