package typings.saslPlain

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.saslPlain.saslPlainBooleans.`true`
import typings.saslPlain.saslPlainStrings.PLAIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-plain", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PlainMechanism {
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_PlainMechanism: PLAIN = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  @JSImport("sasl-plain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-plain", "Mechanism")
  @js.native
  open class Mechanism ()
    extends StObject
       with PlainMechanism {
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_PlainMechanism: PLAIN = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  /* static member */
  @JSImport("sasl-plain", "Mechanism")
  @js.native
  def Mechanism: Instantiable0[PlainMechanism] = js.native
  inline def Mechanism_=(x: Instantiable0[PlainMechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-plain", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-plain", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    inline def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-plain", "prototype.name")
    @js.native
    def name: PLAIN = js.native
    inline def name_=(x: PLAIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var username: String
  }
  object Credentials {
    
    inline def apply(password: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      inline def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlainMechanism
    extends StObject
       with typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true`
    
    @JSName("name")
    var name_PlainMechanism: PLAIN
    
    def response(cred: Credentials): String
  }
  object PlainMechanism {
    
    inline def apply(challenge: String => Unit, response: Credentials => String): PlainMechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = true, name = "PLAIN", response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[PlainMechanism]
    }
    
    extension [Self <: PlainMechanism](x: Self) {
      
      inline def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      inline def setName(value: PLAIN): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
}
