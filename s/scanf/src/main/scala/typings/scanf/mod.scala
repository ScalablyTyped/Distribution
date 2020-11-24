package typings.scanf

import typings.scanf.scanfStrings.PercentsignS
import typings.scanf.scanfStrings.Percentsignd
import typings.scanf.scanfStrings.Percentsignf
import typings.scanf.scanfStrings.Percentsigno
import typings.scanf.scanfStrings.Percentsigns
import typings.scanf.scanfStrings.Percentsignx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("scanf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def apply(format: PercentsignS): String = js.native
  /**
  	 * <p> Read formatted integer from stdin. </p>
  	 * 
  	 * <p> Reads an integer from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents an integer value.
  	 * @return An integer.
  	 */
  def apply(format: Percentsignd): Double = js.native
  /**
  	 * <p> Read formatted float from stdin. </p>
  	 * 
  	 * <p> Reads a float from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents an float value.
  	 * @return A float.
  	 */
  def apply(format: Percentsignf): Double = js.native
  /**
  	 * <p> Read formatted octal from stdin. </p>
  	 * 
  	 * <p> Reads an octal from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents an octal value.
  	 * @return An octal.
  	 */
  def apply(format: Percentsigno): Double = js.native
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
  def apply(format: Percentsigns): String = js.native
  /**
  	 * <p> Read formatted hex from stdin. </p>
  	 * 
  	 * <p> Reads a hex from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents a hex value.
  	 * @return A hex.
  	 */
  def apply(format: Percentsignx): Double = js.native
  
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
  def sscanf_S(source: String, format: PercentsignS): String = js.native
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
  def sscanf_d(source: String, format: Percentsignd): Double = js.native
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
  def sscanf_f(source: String, format: Percentsignf): Double = js.native
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
  def sscanf_o(source: String, format: Percentsigno): Double = js.native
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
  def sscanf_s(source: String, format: Percentsigns): String = js.native
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
  def sscanf_x(source: String, format: Percentsignx): Double = js.native
}
