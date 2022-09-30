package typings.scanf

import typings.scanf.scanfStrings.PercentsignS
import typings.scanf.scanfStrings.Percentsignd
import typings.scanf.scanfStrings.Percentsignf
import typings.scanf.scanfStrings.Percentsigno
import typings.scanf.scanfStrings.Percentsigns
import typings.scanf.scanfStrings.Percentsignx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	 * <p> Reads formatted data from stdin. </p>
  	 * 
  	 * <p> Reads data from stdin and stores them according to the parameter <i>format</i> into an array to be returned. </p>
  	 * 
  	 * @param format The format contains a sequence of characters that control how characters extracted from the stream are tread.
  	 * @return An array containing data constructed from stdin with the <i>format</i>.
  	 */
  inline def apply(format: String): js.Array[Double | String] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double | String]]
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
  inline def apply(format: String, names: String*): js.Object = ^.asInstanceOf[js.Dynamic].apply(scala.List(format.asInstanceOf[js.Any]).`++`(names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  /**
  	 * <p> Read formatted line from stdin. </p>
  	 * 
  	 * <p> Reads a word from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents a word.
  	 * @return A word.
  	 */
  inline def apply(format: PercentsignS): String = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
  	 * <p> Read formatted integer from stdin. </p>
  	 * 
  	 * <p> Reads an integer from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents an integer value.
  	 * @return An integer.
  	 */
  inline def apply(format: Percentsignd): Double = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Double]
  /**
  	 * <p> Read formatted float from stdin. </p>
  	 * 
  	 * <p> Reads a float from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents an float value.
  	 * @return A float.
  	 */
  inline def apply(format: Percentsignf): Double = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Double]
  /**
  	 * <p> Read formatted octal from stdin. </p>
  	 * 
  	 * <p> Reads an octal from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents an octal value.
  	 * @return An octal.
  	 */
  inline def apply(format: Percentsigno): Double = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Double]
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
  inline def apply(format: Percentsigns): String = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
  	 * <p> Read formatted hex from stdin. </p>
  	 * 
  	 * <p> Reads a hex from stdin and returns it according to parameter <i>format</i>. </p>
  	 * 
  	 * @param format The format represents a hex value.
  	 * @return A hex.
  	 */
  inline def apply(format: Percentsignx): Double = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("scanf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def sscanf(source: String, format: String): js.Array[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | String]]
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
  inline def sscanf(source: String, format: String, names: String*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")((scala.List(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  
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
  inline def sscanf_S(source: String, format: PercentsignS): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def sscanf_d(source: String, format: Percentsignd): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  inline def sscanf_f(source: String, format: Percentsignf): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  inline def sscanf_o(source: String, format: Percentsigno): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  inline def sscanf_s(source: String, format: Percentsigns): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def sscanf_x(source: String, format: Percentsignx): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sscanf")(source.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
}
