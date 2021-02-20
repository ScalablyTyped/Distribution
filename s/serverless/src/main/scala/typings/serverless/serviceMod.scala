package typings.serverless

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.CompiledCloudFormationTemplate
import typings.serverless.mod.Event
import typings.serverless.mod.FunctionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("serverless/classes/Service", JSImport.Namespace)
  @js.native
  class ^ protected () extends Service {
    def this(serverless: typings.serverless.mod.^, data: js.Object) = this()
  }
  
  type Custom = StringDictionary[js.Any]
  
  @js.native
  trait Service extends StObject {
    
    var custom: Custom = js.native
    
    def getAllEventsInFunction(functionName: String): js.Array[Event] = js.native
    
    def getAllFunctions(): js.Array[String] = js.native
    
    def getAllFunctionsNames(): js.Array[String] = js.native
    
    def getEventInFunction(eventName: String, functionName: String): Event = js.native
    
    def getFunction(functionName: String): FunctionDefinition = js.native
    
    def getServiceName(): String = js.native
    
    def load(rawOptions: js.Object): js.Promise[_] = js.native
    
    def mergeResourceArrays(): Unit = js.native
    
    var provider: CompiledCloudFormationTemplate = js.native
    
    def setFunctionNames(rawOptions: js.Object): Unit = js.native
    
    def update(data: js.Object): js.Object = js.native
    
    def validate(): Service = js.native
  }
  object Service {
    
    @scala.inline
    def apply(
      custom: Custom,
      getAllEventsInFunction: String => js.Array[Event],
      getAllFunctions: () => js.Array[String],
      getAllFunctionsNames: () => js.Array[String],
      getEventInFunction: (String, String) => Event,
      getFunction: String => FunctionDefinition,
      getServiceName: () => String,
      load: js.Object => js.Promise[_],
      mergeResourceArrays: () => Unit,
      provider: CompiledCloudFormationTemplate,
      setFunctionNames: js.Object => Unit,
      update: js.Object => js.Object,
      validate: () => Service
    ): Service = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], getAllEventsInFunction = js.Any.fromFunction1(getAllEventsInFunction), getAllFunctions = js.Any.fromFunction0(getAllFunctions), getAllFunctionsNames = js.Any.fromFunction0(getAllFunctionsNames), getEventInFunction = js.Any.fromFunction2(getEventInFunction), getFunction = js.Any.fromFunction1(getFunction), getServiceName = js.Any.fromFunction0(getServiceName), load = js.Any.fromFunction1(load), mergeResourceArrays = js.Any.fromFunction0(mergeResourceArrays), provider = provider.asInstanceOf[js.Any], setFunctionNames = js.Any.fromFunction1(setFunctionNames), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAllEventsInFunction(value: String => js.Array[Event]): Self = StObject.set(x, "getAllEventsInFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAllFunctions(value: () => js.Array[String]): Self = StObject.set(x, "getAllFunctions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllFunctionsNames(value: () => js.Array[String]): Self = StObject.set(x, "getAllFunctionsNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEventInFunction(value: (String, String) => Event): Self = StObject.set(x, "getEventInFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetFunction(value: String => FunctionDefinition): Self = StObject.set(x, "getFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetServiceName(value: () => String): Self = StObject.set(x, "getServiceName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoad(value: js.Object => js.Promise[_]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMergeResourceArrays(value: () => Unit): Self = StObject.set(x, "mergeResourceArrays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProvider(value: CompiledCloudFormationTemplate): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFunctionNames(value: js.Object => Unit): Self = StObject.set(x, "setFunctionNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: js.Object => js.Object): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: () => Service): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
}
