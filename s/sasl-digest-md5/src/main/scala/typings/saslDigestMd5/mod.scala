package typings.saslDigestMd5

import org.scalablytyped.runtime.Instantiable1
import typings.saslDigestMd5.saslDigestMd5Booleans.`false`
import typings.saslDigestMd5.saslDigestMd5Strings.`DIGEST-MD5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-digest-md5", JSImport.Namespace)
  @js.native
  class ^ () extends DigestMd5Mechanism {
    def this(options: Options) = this()
  }
  @JSImport("sasl-digest-md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-digest-md5", "Mechanism")
  @js.native
  class Mechanism () extends DigestMd5Mechanism {
    def this(options: Options) = this()
  }
  /* static member */
  @JSImport("sasl-digest-md5", "Mechanism")
  @js.native
  def Mechanism: Instantiable1[/* options */ js.UndefOr[Options], DigestMd5Mechanism] = js.native
  @scala.inline
  def Mechanism_=(x: Instantiable1[/* options */ js.UndefOr[Options], DigestMd5Mechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-digest-md5", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-digest-md5", "prototype.clientFirst")
    @js.native
    def clientFirst: `false` = js.native
    @scala.inline
    def clientFirst_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-digest-md5", "prototype.name")
    @js.native
    def name: `DIGEST-MD5` = js.native
    @scala.inline
    def name_=(x: `DIGEST-MD5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.native
    
    var host: String = js.native
    
    var password: String = js.native
    
    var realm: js.UndefOr[String] = js.native
    
    var serviceName: js.UndefOr[String] = js.native
    
    var serviceType: String = js.native
    
    var username: String = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(host: String, password: String, serviceType: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DigestMd5Mechanism
    extends typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `false` = js.native
    
    @JSName("name")
    var name_DigestMd5Mechanism: `DIGEST-MD5` = js.native
    
    def response(cred: Credentials): String = js.native
  }
  object DigestMd5Mechanism {
    
    @scala.inline
    def apply(
      challenge: String => Unit,
      clientFirst: `false`,
      name: `DIGEST-MD5`,
      response: Credentials => String
    ): DigestMd5Mechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[DigestMd5Mechanism]
    }
    
    @scala.inline
    implicit class DigestMd5MechanismMutableBuilder[Self <: DigestMd5Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientFirst(value: `false`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: `DIGEST-MD5`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var genNonce: js.UndefOr[js.Function0[Double]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenNonce(value: () => Double): Self = StObject.set(x, "genNonce", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenNonceUndefined: Self = StObject.set(x, "genNonce", js.undefined)
    }
  }
}
