organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-1598a5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.3.7-a3543a",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.7-7b8b4f",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.4-d75b15",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.4-b6dd73",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-67e02d",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.2-99db97",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.2-097aab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-intl" % "3.11.0-f10922",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200115Z-257159",
  "org.scalablytyped" %%% "redux" % "4.0.5-79fdb5",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        