package typings.smtpapi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.smtpapi.smtpapiStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("smtpapi", JSImport.Namespace)
  @js.native
  class ^ () extends Instance {
    def this(header: Header) = this()
  }
  @JSImport("smtpapi", JSImport.Namespace)
  @js.native
  val ^ : Constructor = js.native
  
  @js.native
  trait Constructor
    extends Instantiable0[Instance]
       with Instantiable1[/* header */ Header, Instance]
  
  @js.native
  trait Header extends StObject {
    
    var asm_group_id: Double = js.native
    
    var category: js.Array[String] = js.native
    
    var filters: js.Object = js.native
    
    var ip_pool: String = js.native
    
    var section: js.Object = js.native
    
    var send_at: _empty | Double = js.native
    
    var send_each_at: js.Array[Double] = js.native
    
    var sub: js.Object = js.native
    
    var to: js.Array[String] = js.native
    
    var unique_args: js.Object = js.native
  }
  object Header {
    
    @scala.inline
    def apply(
      asm_group_id: Double,
      category: js.Array[String],
      filters: js.Object,
      ip_pool: String,
      section: js.Object,
      send_at: _empty | Double,
      send_each_at: js.Array[Double],
      sub: js.Object,
      to: js.Array[String],
      unique_args: js.Object
    ): Header = {
      val __obj = js.Dynamic.literal(asm_group_id = asm_group_id.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], ip_pool = ip_pool.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], send_each_at = send_each_at.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], unique_args = unique_args.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsm_group_id(value: Double): Self = StObject.set(x, "asm_group_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory(value: js.Array[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryVarargs(value: String*): Self = StObject.set(x, "category", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Object): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSection(value: js.Object): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend_at(value: _empty | Double): Self = StObject.set(x, "send_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend_each_at(value: js.Array[Double]): Self = StObject.set(x, "send_each_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend_each_atVarargs(value: Double*): Self = StObject.set(x, "send_each_at", js.Array(value :_*))
      
      @scala.inline
      def setSub(value: js.Object): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
      
      @scala.inline
      def setUnique_args(value: js.Object): Self = StObject.set(x, "unique_args", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    def addCategory(cat: String): Unit = js.native
    def addCategory(cat: js.Array[String]): Unit = js.native
    
    def addFilter(filter: String, setting: String, `val`: String): Unit = js.native
    def addFilter(filter: String, setting: String, `val`: Double): Unit = js.native
    
    def addSection(sec: String, `val`: String): Unit = js.native
    
    def addSendEachAt(send_each_at: js.Array[Double]): Unit = js.native
    def addSendEachAt(send_each_at: Double): Unit = js.native
    
    def addSubstitution(key: String, `val`: String): Unit = js.native
    def addSubstitution(key: String, `val`: js.Array[String]): Unit = js.native
    
    def addTo(to: String): Unit = js.native
    def addTo(tos: js.Array[String]): Unit = js.native
    
    def addUniqueArg(key: String, `val`: String): Unit = js.native
    
    var header: Header = js.native
    
    def jsonObject(): Header = js.native
    
    def jsonString(): String = js.native
    
    def setASMGroupID(asm_group_id: Double): Unit = js.native
    
    def setCategories(cats: String): Unit = js.native
    def setCategories(cats: js.Array[String]): Unit = js.native
    
    def setFilters(filters: js.Object): Unit = js.native
    
    def setIpPool(ip_pool: String): Unit = js.native
    
    def setSections(sec: js.Object): Unit = js.native
    
    def setSendAt(send_at: Double): Unit = js.native
    
    def setSendEachAt(send_each_at: js.Array[Double]): Unit = js.native
    
    def setSubstitutions(subs: js.Object): Unit = js.native
    
    def setTos(email: String): Unit = js.native
    def setTos(emails: js.Array[String]): Unit = js.native
    
    def setUniqueArgs(`val`: js.Object): Unit = js.native
    
    var version: String = js.native
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Constructor = ^
}
