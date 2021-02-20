package typings.saslmechanisms

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("saslmechanisms", JSImport.Namespace)
  @js.native
  class ^ () extends Factory
  @JSImport("saslmechanisms", JSImport.Namespace)
  @js.native
  val ^ : Instantiable0[Factory] = js.native
  
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
  class FactoryCls () extends Factory
  
  @scala.inline
  def Factory_=(x: Instantiable0[Factory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Factory")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Mechanism extends StObject {
    
    def challenge(chal: String): Unit = js.native
    
    var name: String = js.native
    
    def response(cred: StringDictionary[js.Any]): String = js.native
  }
  object Mechanism {
    
    @scala.inline
    def apply(challenge: String => Unit, name: String, response: StringDictionary[js.Any] => String): Mechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallenge(value: String => Unit): Self = StObject.set(x, "challenge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: StringDictionary[js.Any] => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MechanismStatic extends Instantiable0[Mechanism]
  
  type _To = Instantiable0[Factory]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Instantiable0[Factory] = ^
}
