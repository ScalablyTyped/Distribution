package typings.saslScramSha1

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.saslScramSha1.saslScramSha1Booleans.`true`
import typings.saslScramSha1.saslScramSha1Strings.`SCRAM-SHA-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-scram-sha-1", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ScramSha1Mechanism {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ScramSha1Mechanism: `SCRAM-SHA-1` = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[js.Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  @JSImport("sasl-scram-sha-1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-scram-sha-1", "Mechanism")
  @js.native
  class Mechanism ()
    extends StObject
       with ScramSha1Mechanism {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ScramSha1Mechanism: `SCRAM-SHA-1` = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[js.Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  /* static member */
  @JSImport("sasl-scram-sha-1", "Mechanism")
  @js.native
  def Mechanism: Instantiable1[/* options */ js.UndefOr[Options], ScramSha1Mechanism] = js.native
  @scala.inline
  def Mechanism_=(x: Instantiable1[/* options */ js.UndefOr[Options], ScramSha1Mechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-scram-sha-1", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-scram-sha-1", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    @scala.inline
    def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-scram-sha-1", "prototype.name")
    @js.native
    def name: `SCRAM-SHA-1` = js.native
    @scala.inline
    def name_=(x: `SCRAM-SHA-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.undefined
    
    var clientKey: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var salt: js.UndefOr[String] = js.undefined
    
    var saltedPassword: js.UndefOr[String] = js.undefined
    
    var serverKey: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
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
      def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
      
      @scala.inline
      def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setSaltedPassword(value: String): Self = StObject.set(x, "saltedPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltedPasswordUndefined: Self = StObject.set(x, "saltedPassword", js.undefined)
      
      @scala.inline
      def setServerKey(value: String): Self = StObject.set(x, "serverKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerKeyUndefined: Self = StObject.set(x, "serverKey", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var genNonce: js.UndefOr[js.Function0[Double]] = js.undefined
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
  
  trait ScramSha1Mechanism
    extends StObject
       with typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true`
    
    @JSName("name")
    var name_ScramSha1Mechanism: `SCRAM-SHA-1`
    
    def response(cred: Credentials): String
  }
  object ScramSha1Mechanism {
    
    @scala.inline
    def apply(challenge: String => Unit, response: Credentials => String): ScramSha1Mechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = true, name = "SCRAM-SHA-1", response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[ScramSha1Mechanism]
    }
    
    @scala.inline
    implicit class ScramSha1MechanismMutableBuilder[Self <: ScramSha1Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: `SCRAM-SHA-1`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
}
