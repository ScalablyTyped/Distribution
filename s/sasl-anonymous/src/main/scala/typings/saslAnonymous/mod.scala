package typings.saslAnonymous

import org.scalablytyped.runtime.Instantiable0
import typings.saslAnonymous.saslAnonymousBooleans.`true`
import typings.saslAnonymous.saslAnonymousStrings.ANONYMOUS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-anonymous", JSImport.Namespace)
  @js.native
  class ^ () extends AnonymousMechanism
  @JSImport("sasl-anonymous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-anonymous", "Mechanism")
  @js.native
  class Mechanism () extends AnonymousMechanism
  /* static member */
  @JSImport("sasl-anonymous", "Mechanism")
  @js.native
  def Mechanism: Instantiable0[AnonymousMechanism] = js.native
  @scala.inline
  def Mechanism_=(x: Instantiable0[AnonymousMechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-anonymous", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-anonymous", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    @scala.inline
    def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-anonymous", "prototype.name")
    @js.native
    def name: ANONYMOUS = js.native
    @scala.inline
    def name_=(x: ANONYMOUS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AnonymousMechanism
    extends typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true` = js.native
    
    @JSName("name")
    var name_AnonymousMechanism: ANONYMOUS = js.native
    
    def response(cred: Credentials): String = js.native
  }
  object AnonymousMechanism {
    
    @scala.inline
    def apply(challenge: String => Unit, clientFirst: `true`, name: ANONYMOUS, response: Credentials => String): AnonymousMechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[AnonymousMechanism]
    }
    
    @scala.inline
    implicit class AnonymousMechanismMutableBuilder[Self <: AnonymousMechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: ANONYMOUS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var trace: js.UndefOr[String] = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
}
