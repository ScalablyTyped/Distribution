package typings.redisScripto

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-scripto", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Scripto {
    def this(redisClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any) = this()
    
    /* CompleteClass */
    override def eval(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def evalSha(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def load(scripts: Scripts): Unit = js.native
    
    /* CompleteClass */
    override def loadFromDir(scriptsDir: String): Unit = js.native
    
    /* CompleteClass */
    override def loadFromFile(name: String, filepath: String): Unit = js.native
    
    /* CompleteClass */
    override def run(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
  }
  
  type Script = String
  
  trait Scripto extends StObject {
    
    def eval(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
    
    def evalSha(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
    
    def load(scripts: Scripts): Unit
    
    def loadFromDir(scriptsDir: String): Unit
    
    def loadFromFile(name: String, filepath: String): Unit
    
    def run(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[Any],
      callback: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
  }
  object Scripto {
    
    inline def apply(
      eval: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit,
      evalSha: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit,
      load: Scripts => Unit,
      loadFromDir: String => Unit,
      loadFromFile: (String, String) => Unit,
      run: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit
    ): Scripto = {
      val __obj = js.Dynamic.literal(eval = js.Any.fromFunction4(eval), evalSha = js.Any.fromFunction4(evalSha), load = js.Any.fromFunction1(load), loadFromDir = js.Any.fromFunction1(loadFromDir), loadFromFile = js.Any.fromFunction2(loadFromFile), run = js.Any.fromFunction4(run))
      __obj.asInstanceOf[Scripto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scripto] (val x: Self) extends AnyVal {
      
      inline def setEval(
        value: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "eval", js.Any.fromFunction4(value))
      
      inline def setEvalSha(
        value: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "evalSha", js.Any.fromFunction4(value))
      
      inline def setLoad(value: Scripts => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadFromDir(value: String => Unit): Self = StObject.set(x, "loadFromDir", js.Any.fromFunction1(value))
      
      inline def setLoadFromFile(value: (String, String) => Unit): Self = StObject.set(x, "loadFromFile", js.Any.fromFunction2(value))
      
      inline def setRun(
        value: (String, js.Array[String], js.Array[Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Unit
      ): Self = StObject.set(x, "run", js.Any.fromFunction4(value))
    }
  }
  
  type Scripts = StringDictionary[Script]
}
