package typings.saslPlain

import org.scalablytyped.runtime.Instantiable0
import typings.saslPlain.saslPlainBooleans.`true`
import typings.saslPlain.saslPlainStrings.PLAIN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-plain", JSImport.Namespace)
  @js.native
  class ^ () extends PlainMechanism
  @JSImport("sasl-plain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-plain", "Mechanism")
  @js.native
  class Mechanism () extends PlainMechanism
  /* static member */
  @JSImport("sasl-plain", "Mechanism")
  @js.native
  def Mechanism: Instantiable0[PlainMechanism] = js.native
  @scala.inline
  def Mechanism_=(x: Instantiable0[PlainMechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-plain", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-plain", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    @scala.inline
    def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-plain", "prototype.name")
    @js.native
    def name: PLAIN = js.native
    @scala.inline
    def name_=(x: PLAIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.native
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(password: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PlainMechanism
    extends typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true` = js.native
    
    @JSName("name")
    var name_PlainMechanism: PLAIN = js.native
    
    def response(cred: Credentials): String = js.native
  }
  object PlainMechanism {
    
    @scala.inline
    def apply(challenge: String => Unit, clientFirst: `true`, name: PLAIN, response: Credentials => String): PlainMechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[PlainMechanism]
    }
    
    @scala.inline
    implicit class PlainMechanismMutableBuilder[Self <: PlainMechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: PLAIN): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
}
