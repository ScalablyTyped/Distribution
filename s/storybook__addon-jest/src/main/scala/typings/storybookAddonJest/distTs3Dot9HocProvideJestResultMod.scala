package typings.storybookAddonJest

import typings.react.mod.ComponentType
import typings.storybookAddonJest.anon.AssertionResults
import typings.storybookAddonJest.anon.Instantiable
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9HocProvideJestResultMod {
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/hoc/provideJestResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Component: ComponentType[InjectedProps]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  
  trait AssertionResult extends StObject {
    
    var failureMessages: js.Array[String]
    
    var fullName: String
    
    var status: String
    
    var title: String
  }
  object AssertionResult {
    
    inline def apply(failureMessages: js.Array[String], fullName: String, status: String, title: String): AssertionResult = {
      val __obj = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionResult]
    }
    
    extension [Self <: AssertionResult](x: Self) {
      
      inline def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
      
      inline def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value*))
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait HocProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var api: API
  }
  object HocProps {
    
    inline def apply(api: API): HocProps = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[HocProps]
    }
    
    extension [Self <: HocProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  trait HocState extends StObject {
    
    var kind: js.UndefOr[String] = js.undefined
    
    var storyName: js.UndefOr[String] = js.undefined
    
    var tests: js.UndefOr[js.Array[Test]] = js.undefined
  }
  object HocState {
    
    inline def apply(): HocState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HocState]
    }
    
    extension [Self <: HocState](x: Self) {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setStoryName(value: String): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
      
      inline def setStoryNameUndefined: Self = StObject.set(x, "storyName", js.undefined)
      
      inline def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
    }
  }
  
  trait InjectedProps extends StObject {
    
    var tests: js.UndefOr[js.Array[Test]] = js.undefined
  }
  object InjectedProps {
    
    inline def apply(): InjectedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedProps]
    }
    
    extension [Self <: InjectedProps](x: Self) {
      
      inline def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
    }
  }
  
  trait Test extends StObject {
    
    var name: String
    
    var result: AssertionResults
  }
  object Test {
    
    inline def apply(name: String, result: AssertionResults): Test = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResult(value: AssertionResults): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
