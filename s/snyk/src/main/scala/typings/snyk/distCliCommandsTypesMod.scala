package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTypesMod {
  
  @JSImport("snyk/dist/cli/commands/types", "CommandResult")
  @js.native
  open class CommandResult protected () extends StObject {
    def this(result: String) = this()
    
    def getDisplayResults(): String = js.native
    
    var result: String = js.native
  }
  
  /* note: abstract class */ @JSImport("snyk/dist/cli/commands/types", "TestCommandResult")
  @js.native
  open class TestCommandResult protected () extends CommandResult {
    def this(result: String) = this()
    
    def getJsonResult(): String = js.native
    
    def getSarifResult(): String = js.native
    
    /* protected */ var jsonResult: String = js.native
    
    /* protected */ var sarifResult: String = js.native
  }
  /* static members */
  object TestCommandResult {
    
    @JSImport("snyk/dist/cli/commands/types", "TestCommandResult")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createHumanReadableTestCommandResult(humanReadableResult: String, jsonResult: String): HumanReadableTestCommandResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createHumanReadableTestCommandResult")(humanReadableResult.asInstanceOf[js.Any], jsonResult.asInstanceOf[js.Any])).asInstanceOf[HumanReadableTestCommandResult]
    inline def createHumanReadableTestCommandResult(humanReadableResult: String, jsonResult: String, sarifResult: String): HumanReadableTestCommandResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createHumanReadableTestCommandResult")(humanReadableResult.asInstanceOf[js.Any], jsonResult.asInstanceOf[js.Any], sarifResult.asInstanceOf[js.Any])).asInstanceOf[HumanReadableTestCommandResult]
    
    inline def createJsonTestCommandResult(stdout: String): JsonTestCommandResult = ^.asInstanceOf[js.Dynamic].applyDynamic("createJsonTestCommandResult")(stdout.asInstanceOf[js.Any]).asInstanceOf[JsonTestCommandResult]
    inline def createJsonTestCommandResult(stdout: String, jsonResult: String): JsonTestCommandResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createJsonTestCommandResult")(stdout.asInstanceOf[js.Any], jsonResult.asInstanceOf[js.Any])).asInstanceOf[JsonTestCommandResult]
    inline def createJsonTestCommandResult(stdout: String, jsonResult: String, sarifResult: String): JsonTestCommandResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createJsonTestCommandResult")(stdout.asInstanceOf[js.Any], jsonResult.asInstanceOf[js.Any], sarifResult.asInstanceOf[js.Any])).asInstanceOf[JsonTestCommandResult]
    inline def createJsonTestCommandResult(stdout: String, jsonResult: Unit, sarifResult: String): JsonTestCommandResult = (^.asInstanceOf[js.Dynamic].applyDynamic("createJsonTestCommandResult")(stdout.asInstanceOf[js.Any], jsonResult.asInstanceOf[js.Any], sarifResult.asInstanceOf[js.Any])).asInstanceOf[JsonTestCommandResult]
  }
  
  @js.native
  trait HumanReadableTestCommandResult extends TestCommandResult
  
  trait IgnoreMetadata extends StObject {
    
    var created: js.Date
    
    var expires: js.Date
    
    var reason: String
  }
  object IgnoreMetadata {
    
    inline def apply(created: js.Date, expires: js.Date, reason: String): IgnoreMetadata = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreMetadata] (val x: Self) extends AnyVal {
      
      inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  type IgnoreRulePathData = StringDictionary[IgnoreMetadata]
  
  type IgnoreRules = StringDictionary[js.Array[IgnoreRulePathData]]
  
  @js.native
  trait JsonTestCommandResult extends TestCommandResult
  
  type MethodResult = CommandResult | String | Unit
}
