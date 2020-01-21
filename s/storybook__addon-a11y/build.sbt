organization := "org.scalablytyped"
name := "storybook__addon-a11y"
version := "5.3.7-94d551"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "axe-core" % "3.4.1-364e8b",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-5339c6",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-5dcb4b",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-265421",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-7280a3",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-a56594",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-c8c047",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200114Z-d16766",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-67e02d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-c8cde6",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200115Z-257159",
  "org.scalablytyped" %%% "redux" % "4.0.5-79fdb5",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "storybook__api" % "5.3.7-736043",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.7-784868",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.7-af00ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        