package typings.pymJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pym.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pym.js", "Child")
  @js.native
  open class Child () extends StObject {
    def this(config: ChildOptions) = this()
    
    def getParentPositionInfo(): Unit = js.native
    
    def navigateParentTo(url: String): Unit = js.native
    
    def onMessage(messageType: String, callback: Callback): Unit = js.native
    
    def remove(): Unit = js.native
    
    def scrollParentTo(hash: String): Unit = js.native
    
    def scrollParentToChildEl(id: String): Unit = js.native
    
    def scrollParentToChildPos(pos: Double): Unit = js.native
    
    def sendHeight(): Unit = js.native
    
    def sendMessage(messageType: String, message: String): Unit = js.native
  }
  
  @JSImport("pym.js", "Parent")
  @js.native
  open class Parent protected () extends StObject {
    def this(id: String, url: String) = this()
    def this(id: String, url: String, config: ParentOptions) = this()
    
    def onMessage(messageType: String, callback: Callback): Unit = js.native
    
    def remove(): Unit = js.native
    
    def sendMessage(messageType: String, message: String): Unit = js.native
    
    def sendViewportAndIFramePosition(): Unit = js.native
    
    def sendWidth(): Unit = js.native
  }
  
  inline def autoInit(doNotRaiseEvents: Boolean): js.Array[Parent] = ^.asInstanceOf[js.Dynamic].applyDynamic("autoInit")(doNotRaiseEvents.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parent]]
  
  @JSImport("pym.js", "autoInitInstances")
  @js.native
  val autoInitInstances: js.Array[Parent] = js.native
  
  type Callback = js.Function1[/* value */ String, Unit]
  
  trait ChildOptions extends StObject {
    
    /**
      * parent container id used when navigating the child iframe to a new page but we want to keep it responsive
      */
    var id: js.UndefOr[Double] = js.undefined
    
    /**
      * if passed it will be override the default parentUrl query string parameter name expected on the iframe src
      */
    var parenturlparam: js.UndefOr[String] = js.undefined
    
    /**
      *  polling frequency in milliseconds to send height to parent. defaults to 0.
      */
    var polling: js.UndefOr[Double] = js.undefined
    
    /**
      * callback invoked after receiving a resize event from the parent
      */
    var renderCallback: js.UndefOr[js.Function1[/* message */ String, js.Object | Null]] = js.undefined
    
    /**
      * xdomain to validate messages received. defaults to '*'.
      */
    var xdomain: js.UndefOr[String] = js.undefined
  }
  object ChildOptions {
    
    inline def apply(): ChildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setParenturlparam(value: String): Self = StObject.set(x, "parenturlparam", value.asInstanceOf[js.Any])
      
      inline def setParenturlparamUndefined: Self = StObject.set(x, "parenturlparam", js.undefined)
      
      inline def setPolling(value: Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setRenderCallback(value: /* message */ String => js.Object | Null): Self = StObject.set(x, "renderCallback", js.Any.fromFunction1(value))
      
      inline def setRenderCallbackUndefined: Self = StObject.set(x, "renderCallback", js.undefined)
      
      inline def setXdomain(value: String): Self = StObject.set(x, "xdomain", value.asInstanceOf[js.Any])
      
      inline def setXdomainUndefined: Self = StObject.set(x, "xdomain", js.undefined)
    }
  }
  
  trait ParentOptions extends StObject {
    
    /**
      * if passed and different than false it will be assigned to the iframe allowfullscreen attribute
      */
    var allowfullscreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if passed it will be assigned to the iframe id attribute
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * if passed it will be assigned to the iframe name attribute
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * if passed and different than false it will strip the querystring params parentUrl and parentTitle passed to the iframe src
      */
    var optionalparams: js.UndefOr[String] = js.undefined
    
    /**
      * if passed it will be override the default parentUrl query string parameter name passed to the iframe src
      */
    var parenturlparam: js.UndefOr[String] = js.undefined
    
    /**
      * if passed it will be override the default parentUrl query string parameter value passed to the iframe src
      */
    var parenturlvalue: js.UndefOr[String] = js.undefined
    
    /**
      * if passed it will be assigned to the iframe sandbox attribute (we do not validate the syntax so be careful!!)
      */
    var sandbox: js.UndefOr[String] = js.undefined
    
    /**
      * if passed it will set the throttle wait in order to fire scroll messaging. Defaults to 100 ms.
      */
    var scrollwait: js.UndefOr[Double] = js.undefined
    
    /**
      * if passed it will be assigned to the iframe title attribute
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * if passed it will activate scroll tracking on the parent
      */
    var trackscroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * defaults to '*'. xdomain to validate messages received
      */
    var xdomain: js.UndefOr[String] = js.undefined
  }
  object ParentOptions {
    
    inline def apply(): ParentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParentOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowfullscreen(value: Boolean): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
      
      inline def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptionalparams(value: String): Self = StObject.set(x, "optionalparams", value.asInstanceOf[js.Any])
      
      inline def setOptionalparamsUndefined: Self = StObject.set(x, "optionalparams", js.undefined)
      
      inline def setParenturlparam(value: String): Self = StObject.set(x, "parenturlparam", value.asInstanceOf[js.Any])
      
      inline def setParenturlparamUndefined: Self = StObject.set(x, "parenturlparam", js.undefined)
      
      inline def setParenturlvalue(value: String): Self = StObject.set(x, "parenturlvalue", value.asInstanceOf[js.Any])
      
      inline def setParenturlvalueUndefined: Self = StObject.set(x, "parenturlvalue", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScrollwait(value: Double): Self = StObject.set(x, "scrollwait", value.asInstanceOf[js.Any])
      
      inline def setScrollwaitUndefined: Self = StObject.set(x, "scrollwait", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrackscroll(value: Boolean): Self = StObject.set(x, "trackscroll", value.asInstanceOf[js.Any])
      
      inline def setTrackscrollUndefined: Self = StObject.set(x, "trackscroll", js.undefined)
      
      inline def setXdomain(value: String): Self = StObject.set(x, "xdomain", value.asInstanceOf[js.Any])
      
      inline def setXdomainUndefined: Self = StObject.set(x, "xdomain", js.undefined)
    }
  }
}
