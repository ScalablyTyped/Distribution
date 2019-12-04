organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-5dafb5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.2.6-d4f919",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.4.5-62a570",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.1.6-2dc68f",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.3-5aa6df",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-bdd097",
  "org.scalablytyped" %%% "intl-messageformat" % "7.6.1-d76cab",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.3.0-4e9912",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "react-intl" % "3.7.0-4d4b3e",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-dbf18d",
  "org.scalablytyped" %%% "redux" % "4.0.4-507b3f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        