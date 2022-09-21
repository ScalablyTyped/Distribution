package typings.saslDigestMd5

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.saslDigestMd5.saslDigestMd5Booleans.`false`
import typings.saslDigestMd5.saslDigestMd5Strings.`DIGEST-MD5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-digest-md5", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DigestMd5Mechanism {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `false` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_DigestMd5Mechanism: `DIGEST-MD5` = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  @JSImport("sasl-digest-md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-digest-md5", "Mechanism")
  @js.native
  open class Mechanism ()
    extends StObject
       with DigestMd5Mechanism {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `false` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_DigestMd5Mechanism: `DIGEST-MD5` = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  /* static member */
  @JSImport("sasl-digest-md5", "Mechanism")
  @js.native
  def Mechanism: Instantiable1[/* options */ js.UndefOr[Options], DigestMd5Mechanism] = js.native
  inline def Mechanism_=(x: Instantiable1[/* options */ js.UndefOr[Options], DigestMd5Mechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-digest-md5", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-digest-md5", "prototype.clientFirst")
    @js.native
    def clientFirst: `false` = js.native
    inline def clientFirst_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-digest-md5", "prototype.name")
    @js.native
    def name: `DIGEST-MD5` = js.native
    inline def name_=(x: `DIGEST-MD5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var password: String
    
    var realm: js.UndefOr[String] = js.undefined
    
    var serviceName: js.UndefOr[String] = js.undefined
    
    var serviceType: String
    
    var username: String
  }
  object Credentials {
    
    inline def apply(host: String, password: String, serviceType: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      inline def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait DigestMd5Mechanism
    extends StObject
       with typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `false`
    
    @JSName("name")
    var name_DigestMd5Mechanism: `DIGEST-MD5`
    
    def response(cred: Credentials): String
  }
  object DigestMd5Mechanism {
    
    inline def apply(challenge: String => Unit, response: Credentials => String): DigestMd5Mechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = false, name = "DIGEST-MD5", response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[DigestMd5Mechanism]
    }
    
    extension [Self <: DigestMd5Mechanism](x: Self) {
      
      inline def setClientFirst(value: `false`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      inline def setName(value: `DIGEST-MD5`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var genNonce: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGenNonce(value: () => Double): Self = StObject.set(x, "genNonce", js.Any.fromFunction0(value))
      
      inline def setGenNonceUndefined: Self = StObject.set(x, "genNonce", js.undefined)
    }
  }
}
