package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStepHadoopJarStep extends StObject {
  
  /**
    * List of command line arguments passed to the JAR file's main function when executed.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Path to a JAR file run during the step.
    */
  var jar: String
  
  /**
    * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var mainClass: js.UndefOr[String] = js.undefined
  
  /**
    * A map of properties specified within a configuration classification
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
}
object ClusterStepHadoopJarStep {
  
  inline def apply(jar: String): ClusterStepHadoopJarStep = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStepHadoopJarStep]
  }
  
  extension [Self <: ClusterStepHadoopJarStep](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setJar(value: String): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    inline def setMainClass(value: String): Self = StObject.set(x, "mainClass", value.asInstanceOf[js.Any])
    
    inline def setMainClassUndefined: Self = StObject.set(x, "mainClass", js.undefined)
    
    inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
