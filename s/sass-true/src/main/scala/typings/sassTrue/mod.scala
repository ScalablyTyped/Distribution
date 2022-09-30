package typings.sassTrue

import typings.sassTrue.anon.ReadonlyAssertion
import typings.sassTrue.anon.TypeofimportedSass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sass-true", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatFailureMessage(assertion: ReadonlyAssertion): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFailureMessage")(assertion.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(rawCss: String): js.Array[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawCss.asInstanceOf[js.Any]).asInstanceOf[js.Array[Module]]
  inline def parse(rawCss: String, ctxLines: Double): js.Array[Module] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(rawCss.asInstanceOf[js.Any], ctxLines.asInstanceOf[js.Any])).asInstanceOf[js.Array[Module]]
  
  inline def runSass(sassOptions: Options, trueOptions: TrueOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runSass")(sassOptions.asInstanceOf[js.Any], trueOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Assertion extends StObject {
    
    var assertionType: js.UndefOr[String] = js.undefined
    
    var description: String
    
    var details: js.UndefOr[String] = js.undefined
    
    var expected: js.UndefOr[String] = js.undefined
    
    var output: js.UndefOr[String] = js.undefined
    
    var passed: js.UndefOr[Boolean] = js.undefined
  }
  object Assertion {
    
    inline def apply(description: String): Assertion = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assertion]
    }
    
    extension [Self <: Assertion](x: Self) {
      
      inline def setAssertionType(value: String): Self = StObject.set(x, "assertionType", value.asInstanceOf[js.Any])
      
      inline def setAssertionTypeUndefined: Self = StObject.set(x, "assertionType", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    }
  }
  
  trait Module extends StObject {
    
    var module: String
    
    var modules: js.UndefOr[js.Array[Module]] = js.undefined
    
    var tests: js.Array[Test]
  }
  object Module {
    
    inline def apply(module: String, tests: js.Array[Test]): Module = {
      val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModules(value: js.Array[Module]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: Module*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setTests(value: js.Array[Test]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
    }
  }
  
  type Options = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(options : sass.sass/types/legacy/options.LegacyOptions<'sync'>): sass.sass/types/legacy/render.LegacyResult>[0] */ js.Any
  
  trait Test extends StObject {
    
    var assertions: js.Array[Assertion]
    
    var test: String
  }
  object Test {
    
    inline def apply(assertions: js.Array[Assertion], test: String): Test = {
      val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setAssertions(value: js.Array[Assertion]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      inline def setAssertionsVarargs(value: Assertion*): Self = StObject.set(x, "assertions", js.Array(value*))
      
      inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrueOptions extends StObject {
    
    var contextLines: js.UndefOr[Double] = js.undefined
    
    def describe(description: String, fn: js.Function0[Unit]): Unit
    
    def it(description: String, fn: js.Function0[Unit]): Unit
    
    var sass: js.UndefOr[TypeofimportedSass] = js.undefined
  }
  object TrueOptions {
    
    inline def apply(describe: (String, js.Function0[Unit]) => Unit, it: (String, js.Function0[Unit]) => Unit): TrueOptions = {
      val __obj = js.Dynamic.literal(describe = js.Any.fromFunction2(describe), it = js.Any.fromFunction2(it))
      __obj.asInstanceOf[TrueOptions]
    }
    
    extension [Self <: TrueOptions](x: Self) {
      
      inline def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
      
      inline def setContextLinesUndefined: Self = StObject.set(x, "contextLines", js.undefined)
      
      inline def setDescribe(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "describe", js.Any.fromFunction2(value))
      
      inline def setIt(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "it", js.Any.fromFunction2(value))
      
      inline def setSass(value: TypeofimportedSass): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
      
      inline def setSassUndefined: Self = StObject.set(x, "sass", js.undefined)
    }
  }
}
