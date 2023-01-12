package typings.sentencer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sentencer", JSImport.Namespace)
  @js.native
  val ^ : Sentencer = js.native
  
  trait Sentencer extends StObject {
    
    var actions: typings.sentencer.mod.actions
    
    def configure(options: options): Unit
    
    def make(template: String): String
    
    def use(options: options): Sentencer
  }
  object Sentencer {
    
    inline def apply(actions: actions, configure: options => Unit, make: String => String, use: options => Sentencer): Sentencer = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), make = js.Any.fromFunction1(make), use = js.Any.fromFunction1(use))
      __obj.asInstanceOf[Sentencer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sentencer] (val x: Self) extends AnyVal {
      
      inline def setActions(value: actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setConfigure(value: options => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      inline def setMake(value: String => String): Self = StObject.set(x, "make", js.Any.fromFunction1(value))
      
      inline def setUse(value: options => Sentencer): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Sentencer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Sentencer = ^
  
  type action = js.Function0[String]
  
  type actions = StringDictionary[action]
  
  trait options extends StObject {
    
    var actions: js.UndefOr[typings.sentencer.mod.actions] = js.undefined
    
    var adjectiveList: js.UndefOr[js.Array[String]] = js.undefined
    
    var nounList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      inline def setActions(value: actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAdjectiveList(value: js.Array[String]): Self = StObject.set(x, "adjectiveList", value.asInstanceOf[js.Any])
      
      inline def setAdjectiveListUndefined: Self = StObject.set(x, "adjectiveList", js.undefined)
      
      inline def setAdjectiveListVarargs(value: String*): Self = StObject.set(x, "adjectiveList", js.Array(value*))
      
      inline def setNounList(value: js.Array[String]): Self = StObject.set(x, "nounList", value.asInstanceOf[js.Any])
      
      inline def setNounListUndefined: Self = StObject.set(x, "nounList", js.undefined)
      
      inline def setNounListVarargs(value: String*): Self = StObject.set(x, "nounList", js.Array(value*))
    }
  }
}
