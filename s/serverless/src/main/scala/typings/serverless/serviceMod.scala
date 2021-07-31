package typings.serverless

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.anon.CompiledCloudFormationTemplate
import typings.serverless.mod.Event
import typings.serverless.mod.FunctionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("serverless/classes/Service", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Service {
    def this(serverless: typings.serverless.mod.^, data: js.Object) = this()
    
    /* CompleteClass */
    var custom: Custom = js.native
    
    /* CompleteClass */
    override def getAllEventsInFunction(functionName: String): js.Array[Event] = js.native
    
    /* CompleteClass */
    override def getAllFunctions(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getAllFunctionsNames(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getEventInFunction(eventName: String, functionName: String): Event = js.native
    
    /* CompleteClass */
    override def getFunction(functionName: String): FunctionDefinition = js.native
    
    /* CompleteClass */
    override def getServiceName(): String = js.native
    
    /* CompleteClass */
    override def load(rawOptions: js.Object): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def mergeResourceArrays(): Unit = js.native
    
    /* CompleteClass */
    var provider: CompiledCloudFormationTemplate = js.native
    
    /* CompleteClass */
    override def setFunctionNames(rawOptions: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def update(data: js.Object): js.Object = js.native
    
    /* CompleteClass */
    override def validate(): Service = js.native
  }
  
  type Custom = StringDictionary[js.Any]
  
  trait Service extends StObject {
    
    var custom: Custom
    
    def getAllEventsInFunction(functionName: String): js.Array[Event]
    
    def getAllFunctions(): js.Array[String]
    
    def getAllFunctionsNames(): js.Array[String]
    
    def getEventInFunction(eventName: String, functionName: String): Event
    
    def getFunction(functionName: String): FunctionDefinition
    
    def getServiceName(): String
    
    def load(rawOptions: js.Object): js.Promise[js.Any]
    
    def mergeResourceArrays(): Unit
    
    var provider: CompiledCloudFormationTemplate
    
    def setFunctionNames(rawOptions: js.Object): Unit
    
    def update(data: js.Object): js.Object
    
    def validate(): Service
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
      load: js.Object => js.Promise[js.Any],
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
      def setLoad(value: js.Object => js.Promise[js.Any]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
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
