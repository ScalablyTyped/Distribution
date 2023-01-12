package typings.saslmechanisms

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("saslmechanisms", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Factory
  @JSImport("saslmechanisms", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Instantiable0[Factory] = js.native
  
  @js.native
  trait Factory extends StObject {
    
    def create(mechanisms: js.Array[String]): Mechanism | Null = js.native
    
    def use(mechanism: MechanismStatic): this.type = js.native
    def use(name: String, mechanism: MechanismStatic): this.type = js.native
  }
  /* static member */
  @JSImport("saslmechanisms", "Factory")
  @js.native
  def Factory: Instantiable0[Factory] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("saslmechanisms", "Factory")
  @js.native
  open class FactoryCls ()
    extends StObject
       with Factory
  
  inline def Factory_=(x: Instantiable0[Factory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Factory")(x.asInstanceOf[js.Any])
  
  trait Mechanism extends StObject {
    
    def challenge(chal: String): Unit
    
    var name: String
    
    def response(cred: StringDictionary[Any]): String
  }
  object Mechanism {
    
    inline def apply(challenge: String => Unit, name: String, response: StringDictionary[Any] => String): Mechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      inline def setChallenge(value: String => Unit): Self = StObject.set(x, "challenge", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: StringDictionary[Any] => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MechanismStatic
    extends StObject
       with Instantiable0[Mechanism]
  
  type _To = js.Object & Instantiable0[Factory]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Instantiable0[Factory] = ^
}
