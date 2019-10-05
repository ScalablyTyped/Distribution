package typings.scanf

import typings.scanf.scanfStrings.`%S`
import typings.scanf.scanfStrings.`%d`
import typings.scanf.scanfStrings.`%f`
import typings.scanf.scanfStrings.`%o`
import typings.scanf.scanfStrings.`%s`
import typings.scanf.scanfStrings.`%x`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__node_scanf")
@js.native
object __node_scanf extends js.Object {
  /* ------------------------------------------------------------
  		SSCANF - FROM SOURCE STRING
  	------------------------------------------------------------ */
  @js.native
  object scanf extends js.Object {
    /**
    	 * <p> Reads formatted data from stdin. </p>
    	 * 
    	 * <p> Reads data from stdin and stores them according to the parameter <i>format</i> into an array to be returned. </p>
    	 * 
    	 * @param format The format contains a sequence of characters that control how characters extracted from the stream are tread.
    	 * @return An array containing data constructed from stdin with the <i>format</i>.
    	 */
    def apply(format: String): js.Array[Double | String] = js.native
    /**
    	 * <p> Reads formatted data from stdin. </p>
    	 * 
    	 * <p> Reads data from stdin and stores them according to the parameter <i>format</i> into a JSON object following sequence of <i>names</i>. </p>
    	 * 
    	 * @param format The format contains a sequence of characters that control how characters extracted from the stream are tread.
    	 * @param names Names of data constructed from stdin with the <i>format</i>.
    	 * 
    	 * @return A JSON object containing data constructed from stdin with the <i>format</i> and following <i>names</i>.
    	 */
    def apply(format: String, names: String*): js.Object = js.native
    /**
    	 * <p> Read formatted line from stdin. </p>
    	 * 
    	 * <p> Reads a word from stdin and returns it according to parameter <i>format</i>. </p>
    	 * 
    	 * @param format The format represents a word.
    	 * @return A word.
    	 */
    def apply(format: `%S`): String = js.native
    /**
    	 * <p> Read formatted integer from stdin. </p>
    	 * 
    	 * <p> Reads an integer from stdin and returns it according to parameter <i>format</i>. </p>
    	 * 
    	 * @param format The format represents an integer value.
    	 * @return An integer.
    	 */
    def apply(format: `%d`): Double = js.native
    /**
    	 * <p> Read formatted float from stdin. </p>
    	 * 
    	 * <p> Reads a float from stdin and returns it according to parameter <i>format</i>. </p>
    	 * 
    	 * @param format The format represents an float value.
    	 * @return A float.
    	 */
    def apply(format: `%f`): Double = js.native
    /**
    	 * <p> Read formatted octal from stdin. </p>
    	 * 
    	 * <p> Reads an octal from stdin and returns it according to parameter <i>format</i>. </p>
    	 * 
    	 * @param format The format represents an octal value.
    	 * @return An octal.
    	 */
    def apply(format: `%o`): Double = js.native
    /* ------------------------------------------------------------
    		SCANF - FROM STDIN
    	------------------------------------------------------------ */
    /**
    	 * <p> Read formatted word from stdin. </p>
    	 * 
    	 * <p> Reads a word from stdin and returns it according to parameter <i>format</i>. </p>
    	 * 
    	 * @param format The format represents a word.
    	 * @return A word.
    	 */
    def apply(format: `%s`): String = js.native
    /**
    	 * <p> Read formatted hex from stdin. </p>
    	 * 
    	 * <p> Reads a hex from stdin and returns it according to parameter <i>format</i>. </p>
    	 * 
    	 * @param format The format represents a hex value.
    	 * @return A hex.
    	 */
    def apply(format: `%x`): Double = js.native
    /**
    		 * <p> Reads formatted data from string. </p>
    		 * 
    		 * <p> Reads data from <i>source</i> and stores them according to the parameter <i>format</i> into an array to be returned. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format contains a sequence of characters that control how characters extracted from the stream are tread.
    		 * 
    		 * @return An array containing data constructed from string with the <i>format</i>.
    		 */
    def sscanf(source: String, format: String): js.Array[Double | String] = js.native
    /**
    		 * <p> Reads formatted data from string. </p>
    		 * 
    		 * <p> Reads data from <i>source</i> and stores them according to the parameter <i>format</i> into a JSON object following sequence of <i>names</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format contains a sequence of characters that control how characters extracted from the stream are tread.
    		 * @param names Names of data constructed from string with the <i>format</i>.
    		 * 
    		 * @return A JSON object containing data constructed from string with the <i>format</i> and following <i>names</i>.
    		 */
    def sscanf(source: String, format: String, names: String*): js.Object = js.native
    /**
    		 * <p> Read formatted line from string. </p>
    		 * 
    		 * <p> Reads a word from <i>source</i> and returns it according to parameter <i>format</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format represents a word.
    		 * 
    		 * @return A word.
    		 */
    @JSName("sscanf")
    def sscanf_S(source: String, format: `%S`): String = js.native
    /**
    		 * <p> Read formatted integer from string. </p>
    		 * 
    		 * <p> Reads an integer from <i>source</i> and returns it according to parameter <i>format</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format represents an integer value.
    		 * 
    		 * @return An integer.
    		 */
    @JSName("sscanf")
    def sscanf_d(source: String, format: `%d`): Double = js.native
    /**
    		 * <p> Read formatted float from string. </p>
    		 * 
    		 * <p> Reads a float from <i>source</i> and returns it according to parameter <i>format</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format represents an float value.
    		 * 
    		 * @return A float.
    		 */
    @JSName("sscanf")
    def sscanf_f(source: String, format: `%f`): Double = js.native
    /**
    		 * <p> Read formatted octal from string. </p>
    		 * 
    		 * <p> Reads an octal from <i>source</i> and returns it according to parameter <i>format</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format represents an octal value.
    		 * 
    		 * @return An octal.
    		 */
    @JSName("sscanf")
    def sscanf_o(source: String, format: `%o`): Double = js.native
    /**
    		 * <p> Read formatted word from string. </p>
    		 * 
    		 * <p> Reads a word from <i>source</i> and returns it according to parameter <i>format</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format represents a word.
    		 * 
    		 * @return A word.
    		 */
    @JSName("sscanf")
    def sscanf_s(source: String, format: `%s`): String = js.native
    /**
    		 * <p> Read formatted hex from string. </p>
    		 * 
    		 * <p> Reads a hex from <i>source</i> and returns it according to parameter <i>format</i>. </p>
    		 * 
    		 * @param source Source string to retrieve data.
    		 * @param format The format represents a hex value.
    		 * 
    		 * @return A hex.
    		 */
    @JSName("sscanf")
    def sscanf_x(source: String, format: `%x`): Double = js.native
  }
  
}

