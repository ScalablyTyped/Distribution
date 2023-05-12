package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOptions extends StObject {
  
  /**
    * The ctype option instructs the C++ code generator to use a different
    * representation of the field than it normally would.  See the specific
    * options below.  This option is not yet implemented in the open source
    * release -- sorry, we'll try to include it in a future version!
    */
  var ctype: FieldOptionsCType
  
  /**
    * Is this field deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for accessors, or it will be completely ignored; in the very least, this
    * is a formalization for deprecating fields.
    */
  var deprecated: Boolean
  
  /**
    * The jstype option determines the JavaScript type used for values of the
    * field.  The option is permitted only for 64 bit integral and fixed types
    * (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
    * is represented as JavaScript string, which avoids loss of precision that
    * can happen when a large value is converted to a floating point JavaScript.
    * Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
    * use the JavaScript "number" type.  The behavior of the default option
    * JS_NORMAL is implementation dependent.
    *
    * This option is an enum to permit additional types to be added, e.g.
    * goog.math.Integer.
    */
  var jstype: FieldOptionsJSType
  
  /**
    * Should this field be parsed lazily?  Lazy applies only to message-type
    * fields.  It means that when the outer message is initially parsed, the
    * inner message's contents will not be parsed but instead stored in encoded
    * form.  The inner message will actually be parsed when it is first accessed.
    *
    * This is only a hint.  Implementations are free to choose whether to use
    * eager or lazy parsing regardless of the value of this option.  However,
    * setting this option true suggests that the protocol author believes that
    * using lazy parsing on this field is worth the additional bookkeeping
    * overhead typically needed to implement it.
    *
    * This option does not affect the public interface of any generated code;
    * all method signatures remain the same.  Furthermore, thread-safety of the
    * interface is not affected by this option; const methods remain safe to
    * call from multiple threads concurrently, while non-const methods continue
    * to require exclusive access.
    *
    * Note that implementations may choose not to check required fields within
    * a lazy sub-message.  That is, calling IsInitialized() on the outer message
    * may return true even if the inner message has missing required fields.
    * This is necessary because otherwise the inner message would have to be
    * parsed in order to perform the check, defeating the purpose of lazy
    * parsing.  An implementation which chooses not to check required fields
    * must be consistent about it.  That is, for any particular sub-message, the
    * implementation must either *always* check its required fields, or *never*
    * check its required fields, regardless of whether or not the message has
    * been parsed.
    *
    * As of 2021, lazy does no correctness checks on the byte stream during
    * parsing.  This may lead to crashes if and when an invalid byte stream is
    * finally parsed upon access.
    *
    * TODO(b/211906113):  Enable validation on lazy fields.
    */
  var `lazy`: Boolean
  
  /**
    * The packed option can be enabled for repeated primitive fields to enable
    * a more efficient representation on the wire. Rather than repeatedly
    * writing the tag and type for each element, the entire array is encoded as
    * a single length-delimited blob. In proto3, only explicit setting it to
    * false will avoid using packed encoding.
    */
  var packed: Boolean
  
  /** The parser stores options it doesn't recognize here. See above. */
  var uninterpretedOption: js.Array[UninterpretedOption]
  
  /**
    * unverified_lazy does no correctness checks on the byte stream. This should
    * only be used where lazy with verification is prohibitive for performance
    * reasons.
    */
  var unverifiedLazy: Boolean
  
  /** For Google-internal migration only. Do not use. */
  var weak: Boolean
}
object FieldOptions {
  
  inline def apply(
    ctype: FieldOptionsCType,
    deprecated: Boolean,
    jstype: FieldOptionsJSType,
    `lazy`: Boolean,
    packed: Boolean,
    uninterpretedOption: js.Array[UninterpretedOption],
    unverifiedLazy: Boolean,
    weak: Boolean
  ): FieldOptions = {
    val __obj = js.Dynamic.literal(ctype = ctype.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], jstype = jstype.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any], unverifiedLazy = unverifiedLazy.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  inline def toJSON(message: FieldOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldOptions] (val x: Self) extends AnyVal {
    
    inline def setCtype(value: FieldOptionsCType): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setJstype(value: FieldOptionsJSType): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOption(value: js.Array[UninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
    
    inline def setUnverifiedLazy(value: Boolean): Self = StObject.set(x, "unverifiedLazy", value.asInstanceOf[js.Any])
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
  }
}
