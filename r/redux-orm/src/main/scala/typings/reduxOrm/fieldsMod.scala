package typings.reduxOrm

import org.scalablytyped.runtime.StringDictionary
import typings.reduxOrm.reduxOrmBooleans.`false`
import typings.reduxOrm.reduxOrmBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsMod {
  
  @JSImport("redux-orm/fields", "Attribute")
  @js.native
  class Attribute () extends Field {
    def this(opts: AttributeOpts) = this()
    
    var `type`: typings.reduxOrm.reduxOrmStrings.attr = js.native
  }
  
  @JSImport("redux-orm/fields", "Field")
  @js.native
  class Field () extends StObject {
    
    val index: Boolean = js.native
  }
  
  @JSImport("redux-orm/fields", "ForeignKey")
  @js.native
  class ForeignKey protected () extends RelationalField {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
    
    @JSName("index")
    val index_ForeignKey: `true` = js.native
    
    var `type`: typings.reduxOrm.reduxOrmStrings.fk = js.native
  }
  
  @JSImport("redux-orm/fields", "ManyToMany")
  @js.native
  class ManyToMany protected () extends RelationalField {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
    
    @JSName("index")
    val index_ManyToMany: `false` = js.native
    
    var `type`: typings.reduxOrm.reduxOrmStrings.many = js.native
  }
  
  @JSImport("redux-orm/fields", "OneToOne")
  @js.native
  class OneToOne_ protected () extends RelationalField {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
    
    var `type`: typings.reduxOrm.reduxOrmStrings.oneToOne = js.native
  }
  
  @JSImport("redux-orm/fields", "RelationalField")
  @js.native
  class RelationalField protected () extends Field {
    def this(opts: RelationalFieldOpts) = this()
    def this(toModelName: String) = this()
    def this(toModelName: String, relatedName: String) = this()
  }
  
  @JSImport("redux-orm/fields", "attr")
  @js.native
  val attr: AttrCreator = js.native
  
  @JSImport("redux-orm/fields", "fk")
  @js.native
  val fk: FkCreator = js.native
  
  @JSImport("redux-orm/fields", "many")
  @js.native
  val many: ManyCreator = js.native
  
  @JSImport("redux-orm/fields", "oneToOne")
  @js.native
  val oneToOne: OneToOneCreator = js.native
  
  @js.native
  trait AttrCreator extends StObject {
    
    def apply(): Attribute = js.native
    def apply(opts: AttributeOpts): AttributeWithDefault = js.native
  }
  
  @js.native
  trait AttributeOpts extends StObject {
    
    var getDefault: js.UndefOr[js.Function0[_]] = js.native
  }
  object AttributeOpts {
    
    @scala.inline
    def apply(): AttributeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeOpts]
    }
    
    @scala.inline
    implicit class AttributeOptsMutableBuilder[Self <: AttributeOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDefault(value: () => _): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultUndefined: Self = StObject.set(x, "getDefault", js.undefined)
    }
  }
  
  @js.native
  trait AttributeWithDefault extends Attribute {
    
    def getDefault(): js.Any = js.native
  }
  
  type FieldSpecMap = StringDictionary[Attribute | ForeignKey | ManyToMany | OneToOne_]
  
  @js.native
  trait FkCreator extends StObject {
    
    def apply(opts: RelationalFieldOpts): ForeignKey = js.native
    def apply(toModelName: String): ForeignKey = js.native
    def apply(toModelName: String, relatedName: String): ForeignKey = js.native
  }
  
  @js.native
  trait ManyCreator extends StObject {
    
    def apply(opts: RelationalFieldOpts): ManyToMany = js.native
    def apply(toModelName: String): ManyToMany = js.native
    def apply(toModelName: String, relatedName: String): ManyToMany = js.native
  }
  
  @js.native
  trait OneToOneCreator extends StObject {
    
    def apply(opts: RelationalFieldOpts): OneToOne_ = js.native
    def apply(toModelName: String): OneToOne_ = js.native
    def apply(toModelName: String, relatedName: String): OneToOne_ = js.native
  }
  
  @js.native
  trait RelationalFieldOpts extends StObject {
    
    var as: js.UndefOr[String] = js.native
    
    var relatedName: js.UndefOr[String] = js.native
    
    var through: js.UndefOr[String] = js.native
    
    var throughFields: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var to: String = js.native
  }
  object RelationalFieldOpts {
    
    @scala.inline
    def apply(to: String): RelationalFieldOpts = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationalFieldOpts]
    }
    
    @scala.inline
    implicit class RelationalFieldOptsMutableBuilder[Self <: RelationalFieldOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setRelatedName(value: String): Self = StObject.set(x, "relatedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedNameUndefined: Self = StObject.set(x, "relatedName", js.undefined)
      
      @scala.inline
      def setThrough(value: String): Self = StObject.set(x, "through", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThroughFields(value: js.Tuple2[String, String]): Self = StObject.set(x, "throughFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThroughFieldsUndefined: Self = StObject.set(x, "throughFields", js.undefined)
      
      @scala.inline
      def setThroughUndefined: Self = StObject.set(x, "through", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
