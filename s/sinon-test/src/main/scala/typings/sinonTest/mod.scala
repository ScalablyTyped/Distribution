package typings.sinonTest

import typings.sinon.mod.SinonStatic
import typings.sinonTest.sinonTestStrings.clock
import typings.sinonTest.sinonTestStrings.mock
import typings.sinonTest.sinonTestStrings.requests
import typings.sinonTest.sinonTestStrings.server
import typings.sinonTest.sinonTestStrings.spy
import typings.sinonTest.sinonTestStrings.stub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sinon-test", JSImport.Namespace)
  @js.native
  def apply(sinon: SinonStatic): js.Any = js.native
  @JSImport("sinon-test", JSImport.Namespace)
  @js.native
  def apply(sinon: SinonStatic, config: Configuration): js.Any = js.native
  
  @JSImport("sinon-test", "configureTest")
  @js.native
  def configureTest(sinon: SinonStatic): js.Any = js.native
  @JSImport("sinon-test", "configureTest")
  @js.native
  def configureTest(sinon: SinonStatic, config: Configuration): js.Any = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    var injectInto: js.UndefOr[js.Any] = js.native
    
    var injectIntoThis: js.UndefOr[Boolean] = js.native
    
    var properties: js.UndefOr[js.Array[spy | stub | mock | clock | server | requests]] = js.native
    
    var useFakeServer: js.UndefOr[Boolean] = js.native
    
    var useFakeTimers: js.UndefOr[Boolean] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInjectInto(value: js.Any): Self = StObject.set(x, "injectInto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectIntoThis(value: Boolean): Self = StObject.set(x, "injectIntoThis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectIntoThisUndefined: Self = StObject.set(x, "injectIntoThis", js.undefined)
      
      @scala.inline
      def setInjectIntoUndefined: Self = StObject.set(x, "injectInto", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Array[spy | stub | mock | clock | server | requests]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: (spy | stub | mock | clock | server | requests)*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setUseFakeServer(value: Boolean): Self = StObject.set(x, "useFakeServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFakeServerUndefined: Self = StObject.set(x, "useFakeServer", js.undefined)
      
      @scala.inline
      def setUseFakeTimers(value: Boolean): Self = StObject.set(x, "useFakeTimers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFakeTimersUndefined: Self = StObject.set(x, "useFakeTimers", js.undefined)
    }
  }
}
