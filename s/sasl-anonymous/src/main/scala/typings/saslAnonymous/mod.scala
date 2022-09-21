package typings.saslAnonymous

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.saslAnonymous.saslAnonymousBooleans.`true`
import typings.saslAnonymous.saslAnonymousStrings.ANONYMOUS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-anonymous", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AnonymousMechanism {
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_AnonymousMechanism: ANONYMOUS = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  @JSImport("sasl-anonymous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-anonymous", "Mechanism")
  @js.native
  open class Mechanism ()
    extends StObject
       with AnonymousMechanism {
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_AnonymousMechanism: ANONYMOUS = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  /* static member */
  @JSImport("sasl-anonymous", "Mechanism")
  @js.native
  def Mechanism: Instantiable0[AnonymousMechanism] = js.native
  inline def Mechanism_=(x: Instantiable0[AnonymousMechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-anonymous", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-anonymous", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    inline def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-anonymous", "prototype.name")
    @js.native
    def name: ANONYMOUS = js.native
    inline def name_=(x: ANONYMOUS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait AnonymousMechanism
    extends StObject
       with typings.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true`
    
    @JSName("name")
    var name_AnonymousMechanism: ANONYMOUS
    
    def response(cred: Credentials): String
  }
  object AnonymousMechanism {
    
    inline def apply(challenge: String => Unit, response: Credentials => String): AnonymousMechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = true, name = "ANONYMOUS", response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[AnonymousMechanism]
    }
    
    extension [Self <: AnonymousMechanism](x: Self) {
      
      inline def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      inline def setName(value: ANONYMOUS): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
  
  trait Credentials extends StObject {
    
    var trace: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
}
