package typings.pulumiAws.inputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStepHadoopJarStep extends StObject {
  
  /**
    * List of command line arguments passed to the JAR file's main function when executed.
    */
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Path to a JAR file run during the step.
    */
  var jar: Input[String]
  
  /**
    * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var mainClass: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}
object ClusterStepHadoopJarStep {
  
  inline def apply(jar: Input[String]): ClusterStepHadoopJarStep = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStepHadoopJarStep]
  }
  
  extension [Self <: ClusterStepHadoopJarStep](x: Self) {
    
    inline def setArgs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Input[String]*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setJar(value: Input[String]): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    inline def setMainClass(value: Input[String]): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
    
    inline def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
    
    inline def setProperties(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
